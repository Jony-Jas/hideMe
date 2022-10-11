import javax.swing.*;

public class Page {
    private JTextField textField1;
    private JButton button1;
    private JPanel panel;

    Page()
    {
        JFrame frame = new JFrame();
        frame.setContentPane(panel);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Page();
    }
}
