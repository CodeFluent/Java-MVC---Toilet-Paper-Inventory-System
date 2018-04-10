<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <title>Invalid User</title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    
    <!-- Custom styles for this template -->
  <link href="../css/reg-login.css" rel="stylesheet" type="text/css"/>
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

        <main role="main">
            <h1 class="mt-5">Invalid User</h1>
            <p>Either you don't have an account or typed in the wrong username/password.</p>
        </main>
        
        
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script> 
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>

    </body>
</html>