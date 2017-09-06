<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    session.invalidate();
%>
    
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Du er logget ut <br>
        <a href="sesjon-side.jsp">Prøv annen side igjen</a>
    </body>
</html>
