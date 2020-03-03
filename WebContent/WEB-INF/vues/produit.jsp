<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Produits</title>
</head>
<body>
<h1> ${message}</h1>


<c:forEach items="${produit}" var="prods">
<h3> ${prods.id}</h3>
<h3> ${prods.nom}</h3>
<h3> ${prods.description}</h3>
</c:forEach>

</body>
</html>