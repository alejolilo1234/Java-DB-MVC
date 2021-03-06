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
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validar();
            }
        });
    }


    public void validar() {
        Model.Login mlog = new Model.Login();
        Model.LoginDAO logdao = new Model.LoginDAO();
        String name = txtUser.getText();
        String id = String.valueOf(txtPass.getPassword());

        if(!"".equals(name) || !"".equals(id)) {
            mlog = logdao.login(name, id);
            if(mlog.getId() != null && mlog.getName() != null) {
                LandingPage lp = new LandingPage();
                lp.setVisible(true);
                this.dispose();
            } else JOptionPane.showMessageDialog(null, "No se pudo ingresar. Intentalo de nuevo.");
        }
    }
}
