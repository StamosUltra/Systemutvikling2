<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String s = request.getParameter("search");
    Cookie c = new Cookie("search", s);
    c.setMaxAge(31536000); // 1 år i sekunder
    response.addCookie(c);

    // Find products in DB
    String[] products;
    if(s != null && s.equalsIgnoreCase("mobil")) {
        products = new String[] {"iPhone 6", "Samsung Note 4", "HTC One"};
    } else {
        products = new String[0];
    }
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Resultat:
        <ul>
            <%
                for(int i=0; i<products.length; i++) {
                    out.print("<li>" + products[i] + "</li>");
                }
            %>
        </ul>
    </body>
</html>
