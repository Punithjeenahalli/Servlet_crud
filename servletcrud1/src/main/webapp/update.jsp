<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update" method="post">

<input type="number"  name="sid" value="<%=request.getParameter("id")%>"> <br>
<input type="text"  name="sname" value="<%=request.getParameter("name")%>"> <br>
<input type="email"  name="semail" value="<%=request.getParameter("email")%>"> <br>
<input type="date"  name="sdob" value="<%=request.getParameter("date")%>"> <br>
<input type="number"  name="snumber" value="<%=request.getParameter("number")%>"> <br>
male: <input type="radio" name="gender" value="male">
female: <input type="radio" name="gender" value="female"><br>
country : <select name="scountry">
<option>India</option>
<option>USA</option>
<option>UK</option>

</select><br>

<button> update </button>
<button> reset </button>
</form>
</body>
</html>