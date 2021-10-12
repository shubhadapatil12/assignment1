<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="connectivity.*" %>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
movies st=new movies();
moviesDAO stobj=new moviesDAO();
List<movies> st1 =stobj.getRecords();
%>
<table border='1'>
<tr>
<th>Name</th>
<th>Actor</th>
<th>Actress</th>
<th>Director</th>
<th>YearOfRelease</th>
</tr>
<%
for(movies obj:st1)
{
%>
<tr>
<td><%=obj.getName()%></td>
<td><%=obj.getActor() %></td>
<td><%=obj.getActress() %></td>
<td><%=obj.getDirector() %></td>
<td><%=obj.getYearofrelease() %></td>
<%} %>
<tr>
</body>
</html>