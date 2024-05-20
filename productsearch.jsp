</ in the jsp we search the product by puting the product name on the form after that it give info from product sql table and display on displaypage>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="showProductSearch" method="post">
<label>Product Id</label>
<input type="number" name="prodid"><br>
<br>
<input type="submit" name="Submit" value="Search">

</form>

</body>
</html>