package Beans;


/**
 *
 * @author codefluent
 */
public class UserBean {
    private int id;
    private String username;
    private String password;
    private String role;
    private boolean isLoggedIn;
   

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean isLoggedIn() {
        if (this.isLoggedIn == true) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * To be only set if user is confirmed in the db.
     * @param set 
     */
    public void setIsLoggedIn(boolean set) {
        this.isLoggedIn = set;
    }

    public void setRole(String role) {
        if (canChangeRole() == true) {
            this.role = role;
        } // check if this.role is the same after?
    }
    
    public boolean canChangeRole() {
        if (this.role == "admin") {
            return true;
        } else {
            return false;
        }
    }
    

}
