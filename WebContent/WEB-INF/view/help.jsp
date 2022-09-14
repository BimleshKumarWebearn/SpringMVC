<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.time.LocalDateTime"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
<%
String name=(String)request.getAttribute("name");
Integer RollNumber=(Integer)request.getAttribute("RollNumber");
LocalDateTime time=(LocalDateTime)request.getAttribute("time");
%>

<h1><font color="blue"/>My Name is:<%=name %></h1>
<h1>Roll Number is:<%=RollNumber %></h1>
<h1>Date And Time:<%=time.toString() %></h1>
</body>
</html>