/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author codefluent
 */
public class CartBean {
    
    int userid;
    int productid;
    int quantity;
    
    List<CartBean> list = new ArrayList<CartBean>();
    
    public void addCartItem(CartBean c) {
        list.add(c);
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public List<CartBean> getList() {
        return list;
    }
    
    
}
