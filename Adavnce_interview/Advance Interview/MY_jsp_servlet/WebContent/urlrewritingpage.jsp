<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1 align="center">URL REWRITING Page</h1>

	<p1> session Id Come In Url This is called UrlRewriting </p1>
	<br>

	<h2 align="center">First Disable Cooke</h2>
	<p1> Run In MorZila Edge And Of cookie
	path="edge://settings/content" </p1>
	<br>

	<p1> And Select "Manage and delete cookies and site data" and
	OFF:- Allow sites to save and read cookie data (recommended) </p1>

	<br>
	<br>
	<br>
	<br>


	<form action="sessionTreackHiddenFormFiled" method="post">
		<input type="hidden" name="jsessionid" value="<%=session.getId()%>">
		<input type="submit" value="Submit">
	</form>

</body>
</html>