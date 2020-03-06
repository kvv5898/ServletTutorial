<%!
  public int sum(int a, int b) {
      return a + b;
  }
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Method in JSP</title>
</head>
<body>
 
  <h1>
      1 + 2 =    <%=sum(1, 2)%>
  </h1>
 
</body>
</html>