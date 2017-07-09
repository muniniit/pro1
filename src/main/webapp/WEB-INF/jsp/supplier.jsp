<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib  prefix="core" uri="http://java.sun.com/jsp/jstl/core" %> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="admin.jsp" %>
<form:form class="form-horizontal" method="post" action="supplier"	commandName="SupplierDetails" >
<center><tr>
<td><h3 style="color:blue"> SUPPLIER FORM</h3></td>
</tr><center>
<table>
<tr><td><h4 style="color:cyan">SupplierId:</td><td><form:input path="supplierId"/></h4></td></tr>
<tr><td><h4 style="color:cyan">SupplierName:</td><td><form:input path="supplierName"/></h4></td></tr>
<tr><td><h4 style="color:cyan">SupplierDescription:</td><td><form:input path="supplierDescription"/></h4></td></tr>

<tr><td><h4 style="color:red"><input type="submit" value="${bname}"></h4></td></tr>

</table>
</form:form>
<table class="table table-bordered table-hover table-striped">
 <tr><th>Supplier Id</th>
<th>Supplier Name</th>
<th>Supplier Description</th>


<th>Edit</th>
<th>Delete</th>

</tr> 
<core:forEach items="${supData}" var="supplier">
<tr class="success" >

                <td>${supplier.supplierId}</td> 
                 <td>${supplier.supplierName}</td>
                
                    <td> ${supplier.supplierDescription}</td>
                     <td><a href="updatesup?usup=${supplier.supplierId}">Edit</a></td>
                <td><a href="deletesid?dsid=${supplier.supplierId}">Delete</a></td>
                 

</tr>
</core:forEach>


</table>
<%@include file="footer.jsp" %>
</body>
</html>