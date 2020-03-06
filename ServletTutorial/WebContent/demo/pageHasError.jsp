<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8" errorPage ="error.jsp"%>
<%@ page errorPage ="error.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Page has Error</title>
</head>
<body>
 
  <h2>Page has Error</h2>
 
 
  <%
      // Error divided by 0
      int i = 1000 / 0;
  %>
 
</body>
</html>