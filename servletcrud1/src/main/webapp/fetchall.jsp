<%@page import="servlet_crud.dto.StudentDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<StudentDto> l = (List<StudentDto>) request.getAttribute("abc"); %>
<table border="" style="border: 2px solid blue; width: 100vh; height: 100vh; font-family: serif; font-size: large;">
<tr>
<th>id</th>
<th>name</th>
<th>email</th>
<th>dob</th>
<th>number</th>
<th>gender</th>
<th>country</th>
<th>delete</th>
<th>edit</th>
</tr>
<%for(StudentDto a : l){ %>
<tr>
<td><%= a.getId()%></td>
<td><%= a.getName()%></td>
<td><%= a.getEmail()%></td>
<td><%= a.getDob()%></td>
<td><%= a.getNumber()%></td>
<td><%= a.getGender()%></td>
<td><%= a.getCountry()%></td>
<td><a href="did?pk=<%=a.getId()%>">remove</a></td>
<td><a href="update.jsp?id=<%=a.getId()%>&&country=<%=a.getCountry()%>&&dob=<%=a.getDob()%>&&number=<%=a.getNumber()%>&&gender=<%=a.getGender()%>&&name=<%=a.getName()%>&&email=<%=a.getEmail()%>>">edit</a></td>
</tr>
<%} %>
</table>
</body>
</html>