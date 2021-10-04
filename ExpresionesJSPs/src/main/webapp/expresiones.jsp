<%-- 
    Document   : expresiones
    Created on : 4/10/2021, 02:57:23 PM
    Author     : 56749
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Expresiones JSP</h1>
        Concatenar: <%= "Hola " + "cómo están?"%>
        <br>
        Operación aritmética: <%= 2*3/2%>
        <br>
        Id de Sesión: <%= session.getId()%>
        <br>
        <a href="index.html">Regresar al inicio</a>
    </body>
</html>
