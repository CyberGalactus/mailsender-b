package se.edu.emailsender;

public interface EmailSender {

    void sendEmail(String to, String subject, String messageText);

    void sendEmail(String to, String subject, String messageText, String cc);

}
