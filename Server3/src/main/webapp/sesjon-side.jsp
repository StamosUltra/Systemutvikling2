<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String firstName = (String)session.getAttribute("firstName");
    String lastName = (String)session.getAttribute("lastName");
    if(firstName == null || lastName == null) {
        response.sendRedirect("sesjon-login.html");
    }
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello <%= firstName + " " + lastName %></h1> <br>
        <a href="sesjon-logout.jsp">Logout</a>
    </body>
</html>
