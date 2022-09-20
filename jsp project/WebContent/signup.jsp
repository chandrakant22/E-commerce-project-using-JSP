<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String fname=request.getParameter("fname");
String lname=request.getParameter("lname");
String email=request.getParameter("email");
String mob=request.getParameter("mob");
String web=request.getParameter("web");
String pass=request.getParameter("pass");
String terms=request.getParameter("term");
%>

<b> Form Data </b>
<%=fname %>
<%=lname %>
<%=email %>
<%=mob %>
<%=web %>
<%=pass %>
<%=terms %>
</body>
</html>