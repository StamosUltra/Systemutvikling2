<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String brukernavn = request.getParameter("brukernavn");
    String passord = request.getParameter("passord");
    boolean loginOk = false;
    if(brukernavn != null && brukernavn.equals("hei") && // todo sjekk brukernavn
            passord != null && passord.equals("hei")) {  // og passord i database
        loginOk = true;
        // I JSP har vi allerede et sesjonsobjekt tilgjengelig
        // I en servlet må vi hente det med request.getSession()
        session.setAttribute("firstName", "Hei"); // todo slå opp i database
        session.setAttribute("lastName", "Heisen"); // todo slå opp i database
    } else {
        session.invalidate();
    }
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%= loginOk?"Du er innlogget":"Feil brukernavn eller passord" %><br>
        <a href="sesjon-side.jsp">Gå til annen side</a>
    </body>
</html>
