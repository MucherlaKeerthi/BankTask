<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<div align="center">
<fieldset>
<legend><h1>Login Page</h1></legend>		
		<form:form action="login" method="post" commandName="login">
			<table class="AccountTable" border=0>
				<tr><td><label>Account Holder Name</label></td><td>:</td><td><input type="text" name="name" /></tr>
				
				<tr><td><input type="submit" value="Search!" /></td></tr>				
			</table>
		</form:form>
	</div>
	</fieldset>

</body>
</html>