</ This is the product form page it conatin the product info like id,product name ,price,Quantity etc. all the product data is save to the product sql table >
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="showproductlist" method="post">
<label>Product Id : </label>
<input type="number" name="id"><br>
<br>
<label>Name : </label>
<input type="text" name="prodname"><br>
<br>
<label>Price : </label>
<input type="number" name="price"><br>
<br>
<label>Quantity : </label>
<input type="number" name="qty"><br>
<br>
<input type="submit" name="submit" value="Submit">
</form>
</body>
</html>