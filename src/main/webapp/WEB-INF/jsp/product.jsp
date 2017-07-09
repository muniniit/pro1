
<%@taglib  prefix="core" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="E:\bags images\45.jpg">
<%@include file="admin.jsp" %>
<form:form class="form-horizontal" method="post" action="prod"	commandName="ProductDetails" enctype="multipart/form-data">

<center><tr>
<td><h3 style="color:blue">PRODUCT FORM</h3></td>
</tr>
<table>
<tr><td><h4 style="color:cyan">PRODUCTID:</td><td><form:input path="ProductId"/></h4></td></tr>
<tr><td><h4 style="color:cyan">PRODUCTNAME:</td><td><form:input path="ProductName"/></h4></td></tr>
<tr><td><h4 style="color:cyan">PRODUCTDESCRIPTION:</td><td><form:input path="ProductDescription"/></h4></td></tr>
<tr><td><h4 style="color:cyan">PRODUCTPRICE:</td><td><form:input path="ProductPrice"/></h4></td></tr>
<tr><td><h4 style="color:cyan">SUPPLIERID:</td><td>
<form:select class="form-control" path="supId">
<form:option value="-1">Select Supplier Name></form:option>
<core:forEach items="${supData}" var="sup">
<form:option value="${sup.supplierId}">${sup.supplierName}
</form:option>
</core:forEach>
</form:select></h4></td></tr>
<tr><td><h4 style="color:cyan">CATEGORYID:</td><td>
<form:select class="form-control" path="catId">
<form:option value="-1">Select Category Name></form:option>
<core:forEach items="${catData}" var="cat">
<form:option value="${cat.categoryId}">${cat.categoryName}
</form:option>
</core:forEach>
<div class="form-group">
					<label class="col-md-4 control-label" for="comments">Image</label>
					<div class="col-md-5">
						 <form:input type="file" path="pimage"/>

					</div>
					</div>


</form:select></h4></td></tr>

 </form:form>

<tr><td><h4 style="color:red"><input type="submit" value="${bname}"/></h4></td></tr>



<table class="table table-bordered table-hover table-striped">
 <tr><th>Product Id</th>
<th>Product name</th>

<th>Supplier Id</th>
<th>Category Id</th>

<th>stock</th>
<th>Price</th>

<th>Edit</th>
<th>Delete</th>
<th>Image</th>
</tr> 
<core:forEach items="${prodData}" var="product">
<tr class="success" >

                <td>${product.productId}</td> 
                 <td>${product.productName}</td>
                <td>${product.supId}</td>
                <td> ${product.catId}</td>
                <td>${product.stock}</td>
                    <td> ${product.productPrice}</td>
                     <td><a href="updateprod?uprod=${product.productId}">Edit</a></td>
                <td><a href="deladprod?adpid=${product.productId}">Delete</a></td>
                <td><img src="./resources/images/${product.productId}.jpg" height="50px" width="50px"/></td> 

</tr>
</core:forEach>
<core:forEach items="${prodData}" var="product">
<tr class="success" >

                <td>${product.productId}</td> 
                 <td>${product.productName}</td>
                <td>${product.supId}</td>
                <td> ${product.catId}</td>
                <td>${product.stock}</td>
                    <td> ${product.productPrice}</td>
                     <td><a href="addcart?pid=${product.productId}">Edit</a></td>
                <td><a href="deladprod?adpid=${product.productId}">Delete</a></td>
                <td><img src="./resources/images/${product.productId}.jpg" height="50px" width="50px"/></td> 

</tr>
</core:forEach>


</table>

<%@include file="footer.jsp" %>
</body>
</html>