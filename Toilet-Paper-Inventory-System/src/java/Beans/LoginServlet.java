package Beans;

import Beans.UserBean;
import DAOLogic.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author codefluent
 */
@WebServlet(urlPatterns={"/LoginServlet"})
public class LoginServlet extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
          try (PrintWriter out = response.getWriter()) {
        try 
            {
                UserBean user = new UserBean();
                user.setUsername(request.getParameter("inputUsername"));
                user.setPassword(request.getParameter("inputPassword"));
                UserDAO u = new UserDAO();
                user = u.login(user);

                if (user.isLoggedIn()) {
                    HttpSession session = request.getSession(true);
                    session.setAttribute("currentUser", user);
                    out.println("user logged in");
//                    response.sendRedirect("/Toilet-Paper-Inventory-System/jsp/Admin.jsp");
                } else {
                    out.println("user not logged in");
//                    response.sendRedirect("/Toilet-Paper-Inventory-System/jsp/Invalid.jsp");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
          }
    }     
    

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
       
    }



}
