package se.edu.emailsender;

import javax.swing.*;

public class GUI {
    private JPanel emailPanel;
    private JTextField mailAdressField;
    private JTextField mailSubjectField;
    private JTextField mailTextField;

    public GUI() {
        mailAdressField = new JTextField(20);
        mailSubjectField = new JTextField(20);
        mailTextField = new JTextField(20);

        emailPanel = new JPanel();
        emailPanel.add(new JLabel("Till: "));
        emailPanel.add(mailAdressField);
        emailPanel.add(Box.createHorizontalStrut(15));
        emailPanel.add(new JLabel("Ämne: "));
        emailPanel.add(mailSubjectField);
        emailPanel.add(Box.createHorizontalStrut(15));
        emailPanel.add(new JLabel("Text: "));
        emailPanel.add(mailTextField);
        emailPanel.add(Box.createHorizontalStrut(15));
    }

    public Email showEmailPanel() {
        int result = JOptionPane.showConfirmDialog(null, emailPanel, "Mail App", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            String to = mailAdressField.getText();
            String subject = mailSubjectField.getText();
            String message = mailTextField.getText();

            mailAdressField.setText("");
            mailSubjectField.setText("");
            mailTextField.setText("");

            return new Email(to, subject, message);
        }
        return null;
    }
}

