<%-- 
    Document   : procesarFormulario
    Created on : 4/10/2021, 02:57:34 PM
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
        <h1>Datos procesados</h1>
        Usuario: <%= request.getParameter("usuario") %>
        <br><br>
        Contraseña: <%= request.getParameter("password") %>
        <br><br>
        <a href="index.html">Regresar al inicio</a>
    </body>
</html>
