<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGIN FORM</title>
</head>
<body>
<%@ include file="userHeader.jsp" %>
<form action="perform_login" method="post">
  

  <div class="container" align="center">
    <label><b>UserName</b></label>
    <input type="text" placeholder="Enter Username" name="username" required>
</div>
<div class="container" align="center">
    <label><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>
     </div> 
     <div class="container" align="center"> 
    <button type="submit">Login</button>
    <input type="checkbox" checked="checked"> Remember me
  </div>

  
</form>
<%@include file="footer.jsp" %>
</body>
</html>                                                          