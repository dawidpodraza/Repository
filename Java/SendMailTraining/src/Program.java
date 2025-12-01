import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Program {
    static void main(String[] args) throws EmailException {
        Email email = new SimpleEmail();
        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("podrazad@gmail.com", "tutaj wygeneruj kod aplikacji w google"));
        email.setSSLOnConnect(true);
        email.setFrom("podrazad@gmail.com");
        email.setSubject("TestMail");
        email.setMsg("This is a test mail ... :-)");
        email.addTo("podrazad@icloud.com");
        System.out.println("Rozpoczęto wysyłanie maila ...");
        email.send();
        System.out.println("Wysłano");

    }
}
