<%-- 
    Document   : index
    Created on : 4/10/2021, 02:31:57 PM
    Author     : 56749
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Introduction</title>
    </head>
    <body>
        <h1>Hola Mundo JSP</h1>
        <br>
        <ul>
            <li><%out.print("Hola mundo desde la salida estandar");%></li>
            <li>${"Hola mundo con Expression Language"}</li>
            <li><%="Hola mundo desde una expresión"%></li>
            <li><c:out value="Hola mundo con JSTL"/></li>
        </ul>
    </body>
</html>
