package businnes;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPHeader;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class WSSUsernameTokenSecurityHandler implements SOAPHandler<SOAPMessageContext> {

	private static final String TIMESTAMP_2 = "Timestamp-2";
	private static final String TIMESTAMP = "Timestamp";
	private static final String EXPIRES = "Expires";
	private static final String WSU = "wsu";
	private static final String CREATED = "Created";
	private static final String TYPE = "Type";
	private static final String PASSWORD = "Password";
	private static final String USERNAME_TOKEN_2 = "UsernameToken-2";
	private static final String WSU_ID = "wsu:Id";
	private static final String USERNAME = "Username";
	private static final String USERNAME_TOKEN = "UsernameToken";
	private static final String XMLNS_WSU = "xmlns:wsu";
	private static final String SECURITY = "Security";
	private static final String WSSE = "wsse";
	private static final String URI_SECEXT = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
	private static final String NONCE = "Nonce";
	private static final String ENCODING_TYPE = "EncodingType";
	private static final String BASE64_BINARY = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary";
	private static final String URI_UTILITY = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd";
	private static final String PASSWORD_DIGEST = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordDigest";
	private String login;
	private String pwd;

	public WSSUsernameTokenSecurityHandler() {
	}
	public WSSUsernameTokenSecurityHandler(String login, String senha) {
		this.login = login;
		this.pwd = senha;
	}

	@Override
	public boolean handleMessage(SOAPMessageContext context) {

		Boolean outboundProperty =
				(Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		if (outboundProperty.booleanValue()) {

			try {
				SOAPEnvelope envelope = context.getMessage().getSOAPPart().getEnvelope();
				SOAPFactory factory = SOAPFactory.newInstance();
				SOAPElement securityElem = factory.createElement(SECURITY, WSSE, URI_SECEXT);
				securityElem.addAttribute(QName.valueOf(XMLNS_WSU), URI_UTILITY);

				SOAPElement tokenElem = factory.createElement(USERNAME_TOKEN, WSSE, URI_SECEXT);
				tokenElem.addAttribute(QName.valueOf(WSU_ID), USERNAME_TOKEN_2);

				SOAPElement userElem = factory.createElement(USERNAME, WSSE, URI_SECEXT);
				userElem.addTextNode(login);

				SOAPElement pwdElem = factory.createElement(PASSWORD, WSSE, URI_SECEXT);
				pwdElem.addAttribute(QName.valueOf(TYPE), PASSWORD_DIGEST);


				SOAPElement nonceElem = factory.createElement(NONCE,WSSE,URI_SECEXT);
				String nonce = addNonce();
				nonceElem.addTextNode(nonce);
				nonceElem.addAttribute(QName.valueOf(ENCODING_TYPE), BASE64_BINARY);

				Date currentTime = new Date();

				String created = addCreated(currentTime);

				SOAPElement createdElem = factory.createElement(CREATED,WSU,URI_UTILITY);
				createdElem.addTextNode(created);


				Calendar calendar = Calendar.getInstance();
				calendar.setTime(currentTime);
				calendar.add(Calendar.MINUTE, 5);
				SOAPElement expiresElem = factory.createElement(EXPIRES,WSU,URI_UTILITY);
				expiresElem.addTextNode(addCreated(calendar.getTime()));

				pwdElem.addTextNode(doPasswordDigest(nonce, created, pwd));

				SOAPElement timeStampElem = factory.createElement(TIMESTAMP, WSU, URI_UTILITY);
				timeStampElem.addAttribute(QName.valueOf(WSU_ID), TIMESTAMP_2);

				timeStampElem.addChildElement(createdElem);
				timeStampElem.addChildElement(expiresElem);


				tokenElem.addChildElement(userElem);
				tokenElem.addChildElement(pwdElem);
				tokenElem.addChildElement(nonceElem);
				tokenElem.addChildElement(createdElem);

				securityElem.addChildElement(timeStampElem);
				securityElem.addChildElement(tokenElem);
				
				SOAPHeader header;
				header = envelope.getHeader();
				if(header == null){
					header = envelope.addHeader();
				}
				
				header.addChildElement(securityElem);

			} catch (Exception e) {
				e.printStackTrace();
			}
		} 
		return true;
	}

	@Override
	public Set<QName> getHeaders() {
		return new TreeSet<QName>();
	}
	public static String doPasswordDigest(String nonce, String created, byte[] password) throws Exception {
		String passwdDigest = null;
		byte[] b1 = nonce != null ? Base64.decode(nonce) : new byte[0];
		byte[] b2 = created != null ? created.getBytes("UTF-8") : new byte[0];
		byte[] b3 = password;
		byte[] b4 = new byte[b1.length + b2.length + b3.length];
		int offset = 0;
		System.arraycopy(b1, 0, b4, offset, b1.length);
		offset += b1.length;

		System.arraycopy(b2, 0, b4, offset, b2.length);
		offset += b2.length;

		System.arraycopy(b3, 0, b4, offset, b3.length);

		byte[] digestBytes = generateDigest(b4);
		passwdDigest = Base64.encode(digestBytes);
		return passwdDigest;
	}
	private static MessageDigest digest = null;
	public static synchronized byte[] generateDigest(byte[] inputBytes) throws NoSuchAlgorithmException {
		if (digest == null) {
			digest = MessageDigest.getInstance("SHA-1");
		}
		return digest.digest(inputBytes);
	}

	public static String doPasswordDigest(String nonce, String created, String password) {
		String passwdDigest = null;
		try {
			passwdDigest = doPasswordDigest(nonce, created, password.getBytes("UTF-8"));
		} catch (Exception e) {
			System.out.println("erro gerando digest");
		}
		return passwdDigest;
	}

	public String addNonce() throws NoSuchAlgorithmException {
		byte[] nonceValue = null;
		nonceValue = generateNonce(16);
		return Base64.encode(nonceValue);
	}
	public static String addCreated(Date currentTime) {
		DateFormat zulu = new XmlSchemaDateFormat();
		return zulu.format(currentTime);
	}

	private static SecureRandom random = null;
	public static synchronized byte[] generateNonce(int length) throws NoSuchAlgorithmException {
		if (random == null) {
			random = SecureRandom.getInstance("SHA1PRNG");
		}
		byte[] temp = new byte[length];
		random.nextBytes(temp);
		return temp;
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		return true;
	}

	@Override
	public void close(MessageContext context) {
		//
	}
}