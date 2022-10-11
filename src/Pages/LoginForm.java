package Pages;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

public class LoginForm extends Form {
    private JPanel loginPanel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton signUpButton;

    private JFrame loginFrame;

    public LoginForm(Connection con){
        loginFrame = new JFrame();
        loginFrame.setContentPane(loginPanel);
        loginFrame.setSize(500,300);
        loginFrame.setVisible(true);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateLogin(con);
            }
        });

        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginFrame.dispose();
                new SignUpForm(con);
            }
        });

    }

    void validateLogin(Connection con){
        if(this.isValid(con,usernameField.getText(), String.valueOf(passwordField.getPassword())))
        {
            System.out.println("success");
            loginFrame.dispose();
            new Dashboard(con);
        }
        else
        {
            this.showDialog("Username or Password Wrong");
        }
    }
}
