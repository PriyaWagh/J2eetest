<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<sf:form modelAttribute="reg">
		
		<table border="1">
			<tr>
				<td>Full Name: </td>
				<td> <sf:input id="fullName" path="name"/> </td>
			</tr>
			<tr>
				<td>Email Id: </td>
				<td><sf:input id="emailId" path="email"/> </td> 
			</tr>
			<tr>
				<td>Mobile No: </td>
				<td><sf:input id="mobileNo" path="mobileNo"/> </td>
			</tr>
			<tr>
				<td>Address: </td>
				<td> <sf:input id="address" path="address"/> </td>
			</tr>
			
			<tr>
				<td>Password: </td>
				<td> <sf:input id="password" path="pass"/> </td>
			</tr>
			<tr>
				<td>Confirm Password: </td>
				<td> <sf:input id="confirmPassword" path="confPass"/> </td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="Save data" />
				</td>
			</tr>
		</table>
		
	</sf:form>
	
	<br/>
	
</body>
</html>


