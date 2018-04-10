/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOLogic;

import Beans.CartBean;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author codefluent
 */
public class CartDAO {
    public CartBean order() {
        
         
         String listvalues = "";
         String query = "INSERT INTO Orders (userID, productId, quantity, dateSubmitted)" 
                        + "VALUES (" + listvalues + ")";
        
        Connection conn = null;
        Statement input = null;
        
        System.out.println("Trying to submit cart.");
        
        try {
            conn = ConnectionDAO.getConnection();
            input = conn.createStatement();
            ResultSet rs = input.executeQuery(query);
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
