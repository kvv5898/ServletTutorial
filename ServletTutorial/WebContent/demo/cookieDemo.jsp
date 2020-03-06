<%@ page import="org.o7planning.tutorial.jsp.utils.CookieUtils" %>
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cookie Demo</title>
</head>
<body>
 
 <%
   CookieUtils.demoUserCookie(request,response, out);
 %>
 
 <a href ="http://localhost:9090/ServletTutorial/demo/cookieDemo.jsp">Try again!!</a>
 
 
</body>
</html>