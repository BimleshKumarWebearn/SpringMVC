<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList"%>
   <%@page import="java.util.List"%>
   <%@page isELIgnored="false" %>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
<h1>This is Home Page</h1>
<h2><font color="blue"/>Bimlesh Your Code is Executed Successfully</h2>
<h3>url/home</h3>
<% /*String name=(String)request.getAttribute("name"); 
Integer id=(Integer)request.getAttribute("id");
List<String> friends=(List<String>)request.getAttribute("f");*/
%>


<h1> Nmae is:${name}<%/*=name */%></h1>
<h1> id is:${id}<%/*=id */%></h1>

<c:forEach var="item" items="${f }">
<h1>${item}</h1>
</c:forEach>
<%/*for(String s:friends) 
out.println(s);
*/
%>

</body>
</html>