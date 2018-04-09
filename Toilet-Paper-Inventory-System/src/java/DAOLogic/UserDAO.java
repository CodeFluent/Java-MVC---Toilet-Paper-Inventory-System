package DAOLogic;

import Beans.UserBean;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author codefluent
 */
public class UserDAO extends ConnectionDAO {
    
    public UserBean login(UserBean user) {
        
        String username, password;
        username = user.getUsername();
        password = user.getPassword();
        
        String query = "SELECT * FROM Users WHERE username = '"
                        + username
                        + "' AND password ='"
                        + password
                        + "'";
        
        Connection conn = null;
        Statement input = null;
        
        System.out.println("Trying to login user " + username + "with password " + password + ".");
        
        try {
            conn = ConnectionDAO.getConnection();
            input = conn.createStatement();
            ResultSet rs = input.executeQuery(query);
            boolean moreData = rs.next();
            
            if (!moreData) {
                user.setIsLoggedIn(false);
            } else if (moreData) {
                
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setRole(rs.getString("role"));
                user.setIsLoggedIn(true);
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return user;
        
        
    }
}
