<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<center>Login Form
<br>
<form action="login" method="post">
<input type="hidden" name="requestAction" value="login" />

<table>
	<tr>
		<td>Enter User Name:</td>
		<td><input type="text" name="userName" /></td>
		</tr>
	<tr>
		<td>Enter Password:</td>
		<td><input type="password" name="password" /></td>
	</tr>
		
	<tr>
		<td><input type="submit" value="Login" /></td>
		
	</tr>
</table>
<% if(request.getParameter("loginStatus")!=null){
	if(request.getParameter("loginStatus").equals("fail")){
 %>
 <font color=red>
 <%="Invalid Credentials..!" %>
<%
}
}
%>

</form>
</center>
</body>
</html>