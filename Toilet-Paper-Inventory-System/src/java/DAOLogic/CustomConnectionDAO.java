/* Modify this file in order to get the app running. Remember to run create_tables.sql first. */

package DAOLogic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author codefluent
 */
public class CustomConnectionDAO {
    
    public static Connection getConnection() throws Exception {
        
        Class.forName("com.mysql.jdbc.Driver"); // normally unchanged.
        final String url = "jdbc:mysql://localhost:3306/" + ""; // append your app name here. 
        final String username = ""; // username for mysql 
        final String password = ""; // password for mysql 

        Connection conn = DriverManager.getConnection(url, username, password);

        return conn;

    }
    
}
	