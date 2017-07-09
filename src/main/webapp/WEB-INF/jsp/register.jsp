<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="userHeader.jsp" %>
<form:form class="form-horizontal" method="post" action="register"	commandName="UserDetails" >
<center><tr>
<td><h3 style="color:blue">REGISTRATION FORM</h3></td>
</tr>
<table>
<tr><td><h4 style="color:orange">UserId:</td><td><form:input path="userId"/></h4></td></tr>
<tr><td><h4 style="color:orange">UserName:</td><td><form:input path="username"/></h4></td></tr>
<tr><td><h4 style="color:orange">Name:</td><td><form:input path="name"/></h4></td></tr>
<tr><td><h4 style="color:orange">Password:</td><td><form:password path="password"/></h4></td></tr>
<tr><td><h4 style="color:orange">Email:</td><td><form:input path="email"/></h4></td></tr>
<tr><td><h4 style="color:orange">Mobile:</td><td><form:input path="mobile"/></h4></td></tr>
<tr><td><h4 style="color:red"><input type="submit" value="REGISTER"></h4></td></tr>

</center>
</table>
</form:form>
<%@include file="footer.jsp" %>
</body>
</html>