<%--
  Created by IntelliJ IDEA.
  User: Aliyev Orkhan
  Date: 12/1/2018
  Time: 6:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hosgeldiniz sayfasi</title>
</head>
<body>
    <%
        if(session.getAttribute("username") == null){
            response.sendRedirect("login.jsp");
        }
    %>
    <h1>HOSGELDINIZ</h1>
    siz ${username} olarak oturum actiniz

    <a href="videos.jsp"> Videolar icin baglanti</a>

    <form action="/logout" method="post">
        <input type="submit" value="Logout">
    </form>
</body>
</html>
