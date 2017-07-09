<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib  prefix="core" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="userHeader.jsp" %>

<div>
<table class="table table-bordered table-hover table-striped">
 <tr><th>CartId</th>
<th>CartUser</th>
<th>ProId</th>
<th>ProName</th>
<th>ProPrice</th>
<th>TotalPrice</th>
<th>Image</th>

</tr> 
<core:forEach items="${CartData}" var="cart">
<tr class="success" >

                 <td>${cart.cartId}</td> 
                 <td>${cart.cartUser}</td>
                 <td>${cart.proId}</td>
                 <td> ${cart.proName}</td>
                 <td> ${cart.proPrice}</td>
                 <td> ${cart.totalPrice}</td>
                
                   <td><img src="./resources/images/${cart.proId}.jpg" height="200px" width="200px"/></td>
                     
</tr>

</core:forEach>



</table>
</div>
<%@include file="footer.jsp" %>

</body>
</html>