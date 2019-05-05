<%--
  Created by IntelliJ IDEA.
  User: Aliyev Orkhan
  Date: 12/1/2018
  Time: 6:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Videolar sayfasi</title>
</head>
<body>
<%
    if(session.getAttribute("username") == null){
        response.sendRedirect("login.jsp");
    }
%>

</body>
</html>
