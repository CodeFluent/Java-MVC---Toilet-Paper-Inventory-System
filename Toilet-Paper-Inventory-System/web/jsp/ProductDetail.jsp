<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <title>View Inventory</title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
   
  </head>
  
  <body>
        <header>
          <div class="navbar navbar-dark bg-dark box-shadow">
            <div class="container d-flex justify-content-between">
              <a href="../index.jsp" class="navbar-brand d-flex align-items-center">
                <strong>Toilet Paper Inc.</strong>
              </a>
                 <nav class="my-2 my-md-0 mr-md-3">
                    
                    <% if (session.getAttribute("loggedIn").equals(false)) { %>
                    <a class="p-2 text-light" href="Register-Login.jsp">Register/Login</a>
                    <% } else { %>
                    <a class="p-2 text-light" href="Admin.jsp">Admin</a>
                    <% } %>
                    
                    <a class="p-2 text-light" href="ViewProducts.jsp">View Inventory</a>
                    
                    <% if (session.getAttribute("loggedIn").equals(false)) { %>
                    <a class="p-2 text-light" href="Cart.jsp">Cart</a>
                    <% } else { %>
                    <a class="p-2 text-light" href="Orders.jsp">Orders</a>
                    <% } %>

                </nav>
            </div>
          </div>
        </header>
      
      <%@page import="Beans.ProductBean, DAOLogic.ProductDAO, java.lang.Object"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

      <%  String id = request.getParameter("id");
          int productId = Integer.parseInt(id);
          ProductBean p = ProductDAO.getProductById(productId);
          request.setAttribute("name", p.getName());
          request.setAttribute("description", p.getDescription());
          request.setAttribute("cost", p.printPrice());
          request.setAttribute("stock", p.getStock());
      %>

        
        <main role="main" class="container">
          <h1 class="mt-5">${name}</h1>
          <p class="lead">${description}</p>
          
          <!--for le future: https://blackrockdigital.github.io/startbootstrap-shop-item/-->
          <div class="col-lg-9 mx-auto mt-5">
              <div class="card">
                  <img class="card-img-top" src="http://placehold.it/900x400" alt="">
                  <div class="card-body">
                      <h4>Price: &#36; ${cost} <a href="#" class="btn btn-primary float-right">Put In Cart</a> </h4>
                  </div>
              </div>
              
          </div>
        </main>
        
       
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script> 
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>

    </body>
</html>