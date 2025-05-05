<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- send data and"reciviedformdata_using_jsp_setproperty_getproperty_actiontag.jsp" this jsp set and get data usnig jsp:setproperty and jsp:getproperty tag -->



	<form action="reciviedformdata_using_jsp_setproperty_getproperty_actiontag.jsp" >


		<table>

			<tr>
				<th>First Name:</th>
				<td><input type="text" name="firstName"  /></td>
			</tr>


			<tr>
				<th>Last Name:</th>
				<td><input type="text" name="lastName" /></td>
			</tr>


			<tr>
				<th>LOGIN :</th>
				<td><input type="text" name="login"  /></td>
			</tr>


			<tr>
				<td><input type="submit" name=operation value="Go"></td>
			</tr>

		</table>
	</form>

</body>
</html>