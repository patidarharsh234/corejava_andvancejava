<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!--direct esi form ka data set nhi krega request ke form me aaya data ko automatically set karayega  -->
	<!--session ke scope me rakha data hi ctl pr get kr paoge  request ka data to aaya set get and khtm & new reqest new data  -->

	<jsp:useBean id="userBean" scope="request" class="com.in.bean.UserBean"></jsp:useBean>
	<jsp:setProperty name="userBean" property="*" />


	    <form action="sendformdata_to_jsp_set_get_property_tag.jsp" >
	    <h1 align="center">set And Get data using jsp:setproperty and jsp:getpropety tag </h1>

		<table>

			<tr>
				<th>Fist Name:</th>
				<td><input type="text" name="firstName"
					value=<jsp:getProperty property="firstName" name="userBean"/> /></td>
			</tr>

			<tr>
				<th>Last Name:</th>
				<td><input type="text" name="lastName"
					value=<jsp:getProperty property="lastName" name="userBean"/> /></td>
			</tr>


			
			<tr>
				<th>Login:</th>
				<td><input type="text" name="login"
					value="<%=userBean.getLogin()%>" /></td>
			</tr>

			<tr>

				<td><input type="submit" name="operation" value="sendData" /></td>
			</tr>


		</table>

	</form>

</body>
</html>