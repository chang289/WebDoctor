package webdoctor.common;
import com.google.api.client.http.ByteArrayContent;
import com.google.api.client.repackaged.org.apache.commons.codec.binary.Base64;
import com.google.api.services.gmail.model.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Properties;
import com.google.api.services.gmail.Gmail;
import org.springframework.stereotype.Component;

/**
 * Created by IAN on 2016/11/16.
 */
@Component
public class SendEmail {
    public MimeMessage createEmail(String to, String from, String subject, String bodyText) {
        Properties properties = new Properties();
        Session session = Session.getDefaultInstance(properties);
        MimeMessage email = new MimeMessage(session);
        try {
            email.setFrom(new InternetAddress(from));
            email.addRecipient(javax.mail.Message.RecipientType.TO, new InternetAddress(to));
            email.setSubject(subject);
            email.setText(bodyText);
        }
        catch (MessagingException e) {
            System.out.println("Messaging Exception");
            return null;
        }
        return email;
    }

    private static Message createMessageWithEmail(MimeMessage emailContent) {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try {
            emailContent.writeTo(buffer);
        }
        catch (MessagingException | IOException ex) {
            System.out.println("Messaging Exception");
            return null;
        }
        byte[] bytes = buffer.toByteArray();
        String encodedEmail = Base64.encodeBase64URLSafeString(bytes);
        Message message = new Message();
        message.setRaw(encodedEmail);
        return message;
    }
    public Message sendMessage(Gmail service, String userId, MimeMessage emailContent) {
        if (emailContent == null) {
            return null;
        }
        try {
            Message message = createMessageWithEmail(emailContent);
            message = service.users().messages().send(userId, message).execute();
            return message;
        }
        catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }

}
