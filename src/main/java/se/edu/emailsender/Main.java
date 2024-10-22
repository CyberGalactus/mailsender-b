package se.edu.emailsender;

public class Main {
    public static void main(String[] args) {
        Emailsenderimpl mailo = new Emailsenderimpl("carlos.garma97@gmail.com", "bzyu moxb dfbg kfmi");

        GUI gui = new GUI();

        while (true) {
            Email email = gui.showEmailPanel();

            if (email != null) {
                mailo.sendEmail(email.getTo(), email.getSubject(), email.getMessage());
                System.out.println("Sent email to: " + email.getTo() + ", Subject: " + email.getSubject() + ", Message: " + email.getMessage());
            } else {
                break;
            }
        }
    }
}
