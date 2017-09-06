<%@page import="java.util.Date"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<!DOCTYPE html> 
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title> 
  </head>

  <body>
    <h1>Hello World!!</h1>
	<%= new Date().toString() %>
	<% Thread.sleep(1000); %> 
	<script> 
	  alert(new Date()) 
	</script> 
  </body> 
</html>