<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>New Product</title>
</head>
<body>

<form action="/Exemplehibernate/add" method = "post">
<div>
<label>Product Name</label>
<input type = "text" name = "name" placeholder = "introduce the product name">

</div>

<div>
<label>Description of the product</label>
<textarea type = "text" name = "descrition" placeholder = "introduce the product description"></textarea>

</div>

<div>

<input type = "submit" value = "Save product"> 

</div>




</form>
</body>
</html>