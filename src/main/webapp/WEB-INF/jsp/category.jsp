<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Category Page</title>
</head>
<body background="E:\bags images\45.jpg">/
<%@include file="admin.jsp" %>
<form:form class="form-horizontal" method="post" action="category"	commandName="CategoryDetails" >
<center><tr>
<td><h3 style="color:blue">CATEGORY FORM</h3></td>
</tr>
<table>
<tr><td><h4 style="color:cyan">CategoryId:</td><td><form:input path="categoryId"/></h4></td></tr>
<tr><td><h4 style="color:cyan">CategoryName:</td><td><form:input path="categoryName"/></h4></td></tr>
<tr><td><h4 style="color:cyan">CategoryDescription:</td><td><form:input path="categoryDescription"/></h4></td></tr>

<tr><td><h4 style="color:red"><input type="submit" value="${bname}"></h4></td></tr>

</center>
</table>
</form:form>
<table class="table table-bordered table-hover table-striped">
 <tr><th>Category Id</th>
<th>Category Name</th>
<th>Category Description</th>


<th>Edit</th>
<th>Delete</th>

</tr> 
<core:forEach items="${catData}" var="category">
<tr class="success" >

                <td>${category.categoryId}</td> 
                 <td>${category.categoryName}</td>
                
                    <td> ${category.categoryDescription}</td>
                     <td><a href="update?ucat=${category.categoryId}">Edit</a></td>
                <td><a href="deletecid?dcid=${category.categoryId}">Delete</a></td>
                 

</tr>
</core:forEach>


</table>
<%@include file="footer.jsp" %>
</body>

</html>