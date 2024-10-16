import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JTextField mailAdressField = new JTextField(20);
        JTextField mailSubjectField = new JTextField(20);
        JTextField mailTextField = new JTextField(20);

        JPanel emailPanel = new JPanel();
        emailPanel.add(new JLabel("till: "));
        emailPanel.add(mailAdressField);
        emailPanel.add(Box.createHorizontalStrut(15));
        emailPanel.add(new JLabel("Ämne: "));
        emailPanel.add(mailSubjectField);
        emailPanel.add(Box.createHorizontalStrut(15));
        emailPanel.add(new JLabel("text: "));
        emailPanel.add(mailTextField);
        emailPanel.add(Box.createHorizontalStrut(15));

        int result = JOptionPane.showConfirmDialog(null, emailPanel,
                "Ändra rubriken på din applikation här", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            String Adress = mailAdressField.getText();
            String Subject = mailSubjectField.getText();
            String Text = mailTextField.getText();

            System.out.println("skicka mejl till: " + Adress + "\nÄmne: " + Subject + "\nText: " + Text);

            mailAdressField.setText("");
            mailSubjectField.setText("");
            mailTextField.setText("");
        }
    }
}
