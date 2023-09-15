<%@page import="com.jspiders.spring_mvc.pojo.StudentPOJO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:include page="NavBar.jsp"/>
    
    <%
    StudentPOJO pojo = (StudentPOJO) request.getAttribute("student");
    String msg = (String) request.getAttribute("msg");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
form{
	margin-top : 10px;
}

form table {
	margin : auto;
	width : 100%;
}

tr{
	text-align : center;
}
fieldset table {
	margin: auto;
	text-align: left;
}

fieldset {
	margin: 15px 520px;
	text-align: center;
}

legend {
	color: white;
	background-color: #333;
}

#data {
	background-color : white;
	border : 1px solid black;
	width : 100%;
	border : 1px solid black;
}

#data td {
	border : 1px solid black;
	text-align  : center;
}
</style>
</head>
<body>
	<div align="center">
		<fieldset>
			<legend>Search Student Details</legend>
				<form action="./search" method="post">
					<table>
						<tr>
							<td>Enter ID</td>
							<td> <input type="text" name="id"> </td>						
						</tr>
					</table>
					<input type="submit" value="SEARCH">
				</form>
		</fieldset>
		<%
		if(msg != null){
		%>
		<h3><%=msg %>
		</h3>
		<%
		}
		%>
		<%
		if(pojo != null){
		%>
		<table>
			<tr>
				<td>ID</td>
				<td>NAME</td>
				<td>EMAIL</td>
				<td>CONTACT</td>
				<td>ADDRESS</td>
			</tr>
			<tr>
				<td><%=pojo.getId() %></td>
				<td><%=pojo.getName() %></td>
				<td><%=pojo.getEmail() %></td>
				<td><%=pojo.getContact() %></td>
				<td><%=pojo.getAddress() %></td>
			</tr>
		</table>
		<%
		}
		%>
	</div>
</body>
</html>