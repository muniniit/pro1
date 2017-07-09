<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@include file="userHeader.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body background="E:\bags images\45.jpg">
<div class="container">
	<div class="row">
   <div class="col-xs-4 item-photo">
<div>
<c:forEach var="product" items="${ProductDetails}">
<th><b><h1> Product Image</h1></b></th>
			<td><img src="./resources/images/${product.productId}.jpg"
				style="width: 300px; height: 315px" /></td>
				</c:forEach>
				</div>
				</div>
		
 <div class="col-xs-5" style="border:0px solid gray">
<div>

	<table class="table table-bordered table-hover table-striped">
		<tr>
			<th>Product name</th>
           
		</tr>
		<c:forEach var="product" items="${ProductDetails}">
			<td>"${product.productName}"</td>
			</c:forEach>
			</div>
<div>
 <tr><th>Stock</th></tr>
<c:forEach var="product" items="${ProductDetails}">
       <td>${product.stock}</td>      
</c:forEach>
				</div>
				<div>
 <tr><th>Product Description</th></tr>
<c:forEach var="product" items="${ProductDetails}">
       <td>${product.productDescription}</td>      
</c:forEach>
				</div>
				
								<div>
 <tr><th>Product Price</th></tr>
<c:forEach var="product" items="${ProductDetails}">
       <td>${product.productPrice}</td>     
</c:forEach>
				</div>
				
		 <div>
		<c:forEach var="product" items="${ProductDetails}">
			<tr><td>
				<form action="addcart" method="post">
				<input type="text" name="quantity">
					<input type="text" readonly="readonly" name="pid" value="${product.productId }"/>
					
				<input type="submit" value="AddToCart" />
				</form>
			</td></tr>

		</c:forEach>
		
	</table>
	</div>
	</div>
</div>
</body>
</html>
