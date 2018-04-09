package Beans;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wasfi
 */
public class ProductBean {
    
    int id;
    int stock;
    String name;
    String description;
    Double price;


    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
   
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
    
    public String printPrice() {
        DecimalFormat decim = new DecimalFormat("0.00");
        String s = decim.format(this.price);
        return s;
    }

    public int getStock() {
        return stock;
    }
   

    
}
