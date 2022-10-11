package Pages;

import java.sql.*;

public abstract class Form extends MessageDialog {
    public String name,
                  email,
                  username;

    void showDialog(String message)
    {
        MessageDialog dialog = new MessageDialog(message);
        dialog.pack();
        dialog.setVisible(true);
    }
    boolean isValid(Connection con, String username, String password){
        String query = "SELECT * FROM USERS WHERE username = ? AND password = ?";
        try {
            PreparedStatement smt = con.prepareStatement(query);
            smt.setString(1,username);
            smt.setString(2,password);
            ResultSet res = smt.executeQuery();
            if(res.next()==true)
                return true;
            return false;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
