<%-- 
    Document   : login
    Created on : 06/06/2020, 09:07:28 PM
    Author     : USUARIO
--%>
<%  String respuesta  = (String) request.getAttribute("respuesta");
    %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <%= respuesta%>
    </body>
</html>
