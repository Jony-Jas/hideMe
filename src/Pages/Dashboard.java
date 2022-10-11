package Pages;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

public class Dashboard {
    private JPanel dashboardPanel;
    private JTextField inputField;
    private JButton deleteButton;
    private JTextField usernameField;
    private JTextField passwordField;
    private JButton addButton;
    private JButton searchButton;
    private JTextArea dataArea;
    private JScrollPane scrollPane;

    public Dashboard(Connection con){
        JFrame dashBoardFrame = new JFrame();
        dashBoardFrame.setContentPane(dashboardPanel);
        dashBoardFrame.setSize(600,500);
        dashBoardFrame.setVisible(true);
        dashBoardFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addData(con);
            }
        });
    }

    void addData(Connection con)
    {

    }
}
