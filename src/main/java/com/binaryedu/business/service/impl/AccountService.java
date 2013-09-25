package com.binaryedu.business.service.impl;

import java.util.UUID;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.binaryedu.business.model.IUser;
import com.binaryedu.business.service.IAccountService;
import com.binaryedu.business.service.ICommunicationService;
import com.binaryedu.business.service.ServiceManager;
import com.binaryedu.business.transferobject.LoginTO;
import com.binaryedu.business.transferobject.ResetPasswordTO;
import com.binaryedu.business.transferobject.UserAccountTO;
import com.binaryedu.business.transferobject.VerifyAccountTO;
import com.binaryedu.data.dao.DAOFactory;
import com.binaryedu.exceptions.BinaryException;
import com.binaryedu.exceptions.BinaryExceptionCodes;
import com.binaryedu.util.StringUtils;

/**
 * @author parsingh
 * 
 */
public class AccountService implements IAccountService
{
	private static final Log logger = LogFactory.getLog(AccountService.class);

	private static final IAccountService INSTANCE = new AccountService();

	private ICommunicationService communicationService = ServiceManager.getCommunictionService();

	private AccountService()
	{
	}

	public static IAccountService getInstance()
	{
		return INSTANCE;
	}

	@Override
	public IUser login(LoginTO loginTO) throws BinaryException
	{
		logger.info("Try to login: " + loginTO.getEmail());
		IUser user = null;
		
		UserAccountTO newUserTO = DAOFactory.getAccountDAO().getAccountByEmail(loginTO.getEmail());
		
		if(newUserTO == null){
			throw new BinaryException(BinaryExceptionCodes.USER_DOES_NOT_EXIST);
		}
		else if(!newUserTO.isActive()) {
			throw new BinaryException(BinaryExceptionCodes.USER_NOT_ACTIVE);
		}
		else if (!newUserTO.getPassword().equals(StringUtils.getMD5String(loginTO.getPassword(), loginTO.getEmail())))
		{
			throw new BinaryException(BinaryExceptionCodes.PASSWORD_INCORRECT);
		}
		else
		{
			user = ServiceManager.getUserService().getUser(loginTO);
		}
		return user;
	}

	@Override
	public void addAccount(UserAccountTO accountData) throws BinaryException
	{
		logger.info("Adding a new account");

		// Set unique activation key
		accountData.setActivationKey(UUID.randomUUID().toString());
		accountData.setActive(false);
		accountData.setPassword(StringUtils.getMD5String(accountData.getPassword(), accountData.getEmail()));
		DAOFactory.getAccountDAO().addAccount(accountData);
		communicationService.sendVerificationEmail(accountData);
	}

	@Override
	public void sendResetPasswordEmail(String email) throws BinaryException
	{
		logger.info("Sending resend password email to: " + email);

		UserAccountTO newUserTO = DAOFactory.getAccountDAO().getAccountByEmail(email);
		
		if(newUserTO == null)
		{
			throw new BinaryException(BinaryExceptionCodes.USER_DOES_NOT_EXIST);
		}
		
		ResetPasswordTO resetPasswordTO = new ResetPasswordTO();
		resetPasswordTO.setEmail(email);
		resetPasswordTO.setKey(UUID.randomUUID().toString());
		
		DAOFactory.getAccountDAO().addResetPasswordRow(resetPasswordTO);
		communicationService.sendResetPasswordEmail(resetPasswordTO);
	}

	@Override
	public void changePassword(IUser user, String oldPassword, String newPassword) throws BinaryException
	{

		logger.info("Changing password for: " + user.getEmail());

		UserAccountTO newUserTO = DAOFactory.getAccountDAO().getAccountByEmail(user.getEmail());
		if (newUserTO.getPassword().equals(StringUtils.getMD5String(oldPassword, user.getEmail())))
		{
			newUserTO.setPassword(StringUtils.getMD5String(newPassword, user.getEmail()));
			DAOFactory.getAccountDAO().updateAccount(newUserTO);
		}
		else
		{
			throw new BinaryException(BinaryExceptionCodes.PASSWORD_INCORRECT);
		}
	}

	@Override
	public void verifyAccount(VerifyAccountTO verifyAccountTO) throws BinaryException
	{
		logger.info("Verifying Account for: " + verifyAccountTO.getEmail());
		UserAccountTO newUserTO = DAOFactory.getAccountDAO().getAccountByEmail(verifyAccountTO.getEmail());

		if(newUserTO == null)
		{
			throw new BinaryException(BinaryExceptionCodes.USER_DOES_NOT_EXIST);
		}
		
		UUID storedUUID = UUID.fromString(newUserTO.getActivationKey());
		UUID givenUUID = UUID.fromString(verifyAccountTO.getActivationKey());

		if (storedUUID.equals(givenUUID))
		{
			newUserTO.setActive(true);
			DAOFactory.getAccountDAO().updateAccount(newUserTO);
		}
		else
		{
			throw new BinaryException(BinaryExceptionCodes.ACTIVATION_KEY_INCORRECT);
		}
	}

	@Override
	public boolean accountExists(String email)
	{
		logger.info("Check if account exists: " + email);

		UserAccountTO newUserTO = DAOFactory.getAccountDAO().getAccountByEmail(email);
		return (newUserTO != null);
	}

	@Override
	public void resendVerificationEmail(String email) throws BinaryException
	{
		logger.info("Resending verification email to: " + email);

		UserAccountTO newUserTO = DAOFactory.getAccountDAO().getAccountByEmail(email);
		
		if(newUserTO == null)
		{
			throw new BinaryException(BinaryExceptionCodes.USER_DOES_NOT_EXIST);
		}
		
		communicationService.sendVerificationEmail(newUserTO);
		
	}
	
	@Override
	public void resetPassword(ResetPasswordTO resetPasswordTO) throws BinaryException
	{
		logger.info("Resetting password for: " + resetPasswordTO.getEmail());
		
		ResetPasswordTO storedTO = DAOFactory.getAccountDAO().getResetPasswordRow(resetPasswordTO.getEmail());
		
		if(storedTO == null)
		{
			throw new BinaryException(BinaryExceptionCodes.LINK_EXPIRED);
		}
		
		UUID storedUUID = UUID.fromString(storedTO.getKey());
		UUID givenUUID = UUID.fromString(resetPasswordTO.getKey());

		if (storedUUID.equals(givenUUID))
		{
			UserAccountTO userAccountTO = DAOFactory.getAccountDAO().getAccountByEmail(resetPasswordTO.getEmail());
			String newPassword = getNewRandomPassword();
			
			userAccountTO.setPassword(StringUtils.getMD5String(newPassword, resetPasswordTO.getEmail()));
			DAOFactory.getAccountDAO().updateAccount(userAccountTO);
			DAOFactory.getAccountDAO().deleteResetPasswordRow(storedTO);
			communicationService.sendNewPassword(resetPasswordTO.getEmail(), newPassword);
		}
		else
		{
			throw new BinaryException(BinaryExceptionCodes.ACTIVATION_KEY_INCORRECT);
		}
	}
	
	private String getNewRandomPassword()
	{
		return UUID.randomUUID().toString().substring(0, 8);
	}
}
