package View;

import javax.swing.*;

public class DBPassword extends JFrame {
    private JPanel panel1;
    private JPasswordField passwordField1;

    public String getPassWord() {
        int option;
        char[] password;
        do {
            String[] options = new String[]{"Cancel", "Ok"};
            option = JOptionPane.showOptionDialog(null, panel1, "Atención", JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[1]);
            if(option != 1) JOptionPane.showMessageDialog(null, "No proporcionaste ninguna contraseña.");
        } while (option != 1);
        password = passwordField1.getPassword();
        return new String(password);
    }
}
