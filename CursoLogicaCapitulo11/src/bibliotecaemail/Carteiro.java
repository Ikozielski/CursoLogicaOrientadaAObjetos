package bibliotecaemail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Carteiro {
	static void enviar(String para, String assunto, String menssagem) throws EmailException {
		
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("codetest696", "batatadown9"));
		email.setSSLOnConnect(true);
		email.setFrom("codetest696@gmail.com");
		email.setSubject(assunto);
		email.setMsg(menssagem);
		email.addTo(para);
		email.send();
		
	}
}
