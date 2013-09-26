package com.binaryedu.business.service.impl;

import java.io.UnsupportedEncodingException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.binaryedu.business.model.IUser;
import com.binaryedu.business.model.impl.User;
import com.binaryedu.business.service.ICommunicationService;
import com.binaryedu.business.transferobject.ResetPasswordTO;
import com.binaryedu.business.transferobject.UserAccountTO;
import com.binaryedu.exceptions.BinaryException;
import com.binaryedu.exceptions.BinaryExceptionCodes;

public class CommunicationService implements ICommunicationService
{
	protected final Log logger = LogFactory.getLog(this.getClass());
	private final String URL = "http://binaryedu.com/";
//	private final String URL = "http://binaryedu.com/beta";
//	private final String URL = "http://localhost:8080/BinaryEduWeb/";
	
	private static final ICommunicationService INSTANCE = new CommunicationService();

	private CommunicationService()
	{

	}

	public static ICommunicationService getInstance()
	{
		return INSTANCE;
	}

	@Override
	public void sendVerificationEmail(UserAccountTO newUserTO) throws BinaryException
	{
		sendEmail(newUserTO.getEmail(), "Verify your account", "Verify Account", "<p>This is your verification mail. Click on the link to activate your Binary Edu account:</p><p>" + 
				"<a href='" + URL + "activateAccount.htm?email="
				+ newUserTO.getEmail() + "&key=" + newUserTO.getActivationKey() + 
				"'><font color='navy'>" + 
				URL + "activateAccount.htm?email="
				+ newUserTO.getEmail() + "&key=" + newUserTO.getActivationKey() + "</font></a></p>" + 
				"<p>If clicking on the link does not work, you can copy and paste this link into a web browser.</p>" + 
				"<p>Regards, <br/>Binary Edu Team</p>");
	}
	
	@Override
	public void sendNewPassword(String email, String password) throws BinaryException
	{
		sendEmail(email, "Your New Password", "New Password", "<p>Your new password for Binary Edu web site is <b>" + password + "</b></p>" + 
				"<p>Regards, <br/>Binary Edu Team</p>");
	}
	
	@Override
	public void sendResetPasswordEmail(ResetPasswordTO resetPasswordTO) throws BinaryException
	{
		sendEmail(resetPasswordTO.getEmail(), "Reset your password", 
				"Reset Password Request", "<p>Click the following link to generate a new password for your account:</p>" + 
				"<p><a href='" + URL + "resetPassword.htm?email=" + 
				resetPasswordTO.getEmail() + 
				"&key=" + resetPasswordTO.getKey() + 
				"'><font color='navy'>" +
				URL + "resetPassword.htm?email=" + 
				resetPasswordTO.getEmail() + "&key=" + resetPasswordTO.getKey() +
				"</font></a></p>" + 
				"<p>If clicking on the link does not work, you can copy and paste this link into a web browser.</p>" +
				"<p>Regards, <br/>Binary Edu Team</p>");

	}

	protected void sendEmail(String email, String subject, String heading, String content) throws BinaryException
	{

		IUser[] userList = new User[1];
		User user = new User();
		user.setEmail(email);
		userList[0] = user;

		sendEmail(userList, subject, heading, content);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.binaryedu.business.service.ICommunicationService#sendEmail(com.binaryedu
	 * .business.model.IUser[], java.lang.String, java.lang.String)
	 */

	protected void sendEmail(IUser[] users, String subject, String heading, String content) throws BinaryException
	{
		try
		{
			Properties props = new Properties();
			props.put("mail.transport.protocol", "smtp");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.host", "smtp.live.com");
			props.put("mail.smtp.port", "587");
			props.put("mail.user", "binaryedu@outlook.com");
			props.put("mail.password", "dhamaka123");
			props.put("mail.smtp.auth", "true");

			Authenticator auth = new SMTPAuthenticator();

			Session mailSession = Session.getDefaultInstance(props, auth);
			Transport transport = mailSession.getTransport();

			MimeMessage message = new MimeMessage(mailSession);
			InternetAddress fromAddress = new InternetAddress("admin@binaryedu.com");
			fromAddress.setPersonal("Binary Edu");
			message.setFrom(fromAddress);
			message.setSubject(subject);
			message.setContent(getEmailHead(heading) + content + getEmailTail(), "text/html");
			for (IUser user : users)
			{
				message.addRecipient(Message.RecipientType.TO, new InternetAddress(user.getEmail()));
			}

			transport.connect();
			transport.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
			transport.close();
		}
		catch (AddressException e)
		{
			logger.error(e.getStackTrace());
			throw new BinaryException(BinaryExceptionCodes.UNABLE_TO_SEND_EMAIL);
		}
		catch (NoSuchProviderException e)
		{
			logger.error(e.getStackTrace());
			throw new BinaryException(BinaryExceptionCodes.UNABLE_TO_SEND_EMAIL);
		}
		catch (UnsupportedEncodingException e)
		{
			logger.error("UnsupportedEncodingException", e);
			throw new BinaryException(BinaryExceptionCodes.UNABLE_TO_SEND_EMAIL);
		}
		catch (MessagingException e)
		{
			logger.error("MessagingException", e);
			throw new BinaryException(BinaryExceptionCodes.UNABLE_TO_SEND_EMAIL);
		}

	}

	/**
	 * SimpleAuthenticator is used to do simple authentication when the SMTP
	 * server requires it.
	 */
	private static class SMTPAuthenticator extends javax.mail.Authenticator
	{

		public javax.mail.PasswordAuthentication getPasswordAuthentication()
		{
			String username = "binaryedu@outlook.com";
			String password = "dhamaka123";
			return new javax.mail.PasswordAuthentication(username, password);
		}
	}

	private String getEmailHead(String heading)
	{
		return  "<font face=\"'Trebuchet MS', Arial, Helvetica, Verdana, Sans-Serif\">\r\n" + 
				"<table width=\"100%\" cellpadding=\"5\" cellspacing=\"0\">\r\n" + 
				"<tr>\r\n" + 
				"<td width=\"100%\" height=\"70\"><img src=\"http://binaryedu.com/images/logo_small.png\"/></td>\r\n" + 
				"</tr>\r\n" + 
				"<tr>\r\n" + 
				"<td width=\"100%\" height=\"5\" bgcolor=\"#333333\"></td>\r\n" + 
				"</tr>\r\n" + 
				"<tr>\r\n" + 
				"<td width=\"100%\" height=\"40\" valign=\"bottom\">\r\n" + 
				"<font size=\"4\" face=\"'Trebuchet MS', Arial, Helvetica, Verdana, Sans-Serif\">" + heading + "</font>\r\n" + 
				"\r\n" + 
				"</td></tr>\r\n" + 
				"<tr><td valign=\"top\">\r\n" + 
				"<font size=\"2\" face=\"'Trebuchet MS', Arial, Helvetica, Verdana, Sans-Serif\">";
	}
	
	private String getEmailTail()
	{
		return "</font>\r\n" + 
				"</td>\r\n" + 
				"</tr>\r\n" + 
				"<tr>\r\n" + 
				"<td width=\"100%\" height=\"50\" bgcolor=\"#FFFFFF\"></td>\r\n" + 
				"</tr>\r\n" + 
				"<tr>\r\n" + 
				"<td width=\"100%\" bgcolor=\"#757A84\" height=\"20\"></td>\r\n" + 
				"</tr>\r\n" + 
				"</table>\r\n" + 
				"</font>";
	}
	
	public static void main(String[] args) throws BinaryException {
		ICommunicationService service = CommunicationService.getInstance();
		service.sendNewPassword("parambirs@gmail.com", "abc123");
	}
}
