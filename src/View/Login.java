package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Login extends JFrame {
    private JPanel panel1;
    private JTextField txtUser;
    private JPasswordField txtPass;
    private JButton ingresarButton;

    public Login() {
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setTitle("Hola mundo");
        this.setSize(500,250);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.add(panel1);
        this.setResizable(false);
    }

    public void validar() {

    }
}
