import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Program {
    static void main(String[] args) throws EmailException {
        Email email = new SimpleEmail();
        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("podrazad@gmail.com", "gbwa eiga ypcd sbpk"));
        email.setSSLOnConnect(true);
        email.setFrom("podrazad@gmail.com");
        email.setSubject("Mail testowy z Maven");
        email.setMsg("To jest mail testowy z projektu Maven");
        email.addTo("podrazad@icloud.com");
        System.out.println("Wysyłam maila...");
        email.send();
        System.out.println("Wysłałem");
    }
}
