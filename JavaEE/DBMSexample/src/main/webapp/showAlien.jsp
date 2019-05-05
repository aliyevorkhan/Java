<%@ page import="com.controller.model.Alien" %><%--
  Created by IntelliJ IDEA.
  User: Aliyev Orkhan
  Date: 12/9/2018
  Time: 5:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>show alien jsp</title>
</head>
<body bgcolor="red">

    <%
        Alien a1 = (Alien) request.getAttribute("alien");
        out.println(a1);
    %>
</body>
</html>
