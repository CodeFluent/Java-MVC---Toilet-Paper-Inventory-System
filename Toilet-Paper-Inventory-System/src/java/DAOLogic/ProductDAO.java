/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOLogic;

import Beans.ProductBean;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wasfi
 */
public class ProductDAO extends ConnectionDAO {
    public static List<ProductBean> getAllProducts() {
        String query = "SELECT * FROM Products";
        
        Connection conn = null;
        Statement input = null;
        List<ProductBean> list = new ArrayList<ProductBean>();
        
         try {
            conn = ConnectionDAO.getConnection();
            input = conn.createStatement();
            ResultSet rs = input.executeQuery(query);
            
            while(rs.next()) {
                ProductBean p = new ProductBean();
                p.setId(rs.getInt("productId"));
                p.setName(rs.getString("name"));
                p.setDescription(rs.getString("description"));
                p.setPrice(rs.getDouble("cost"));
                p.setStock(rs.getInt("stock"));
               
                list.add(p);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
         return list;
    }
    
    public static ProductBean getProductById(int id) {
        String query = "SELECT * FROM Products WHERE productId=" + id;
        
        Connection conn = null;
        Statement input = null;
        ProductBean p = new ProductBean();
        
        try {
            conn = ConnectionDAO.getConnection();
            input = conn.createStatement();
            ResultSet rs = input.executeQuery(query);
            
            while(rs.next()) {
                p.setId(rs.getInt("productId"));
                p.setName(rs.getString("name"));
                p.setDescription(rs.getString("description"));
                p.setPrice(rs.getDouble("cost"));
                p.setStock(rs.getInt("stock"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
         System.out.println("Product: " + p.getName());
         return p;
    }
}
