<%@page contentType="text/html; charset=ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Todos los apellidos</title>
</head>
<body>
<c:forEach var="h" items="${lista}" varStatus="loop">
        <p>${h.apellido}</p>
        <p>hola manolo</p>
</c:forEach>
</body>
</html>
