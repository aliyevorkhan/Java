<%--
  Created by IntelliJ IDEA.
  User: Aliyev Orkhan
  Date: 11/30/2018
  Time: 7:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>HOME</title>
  </head>
  <body bgcolor="#a9a9a9">
    <%for (int i = 0; i<5; i++){%>
    <h3>Giris sayfasina hosgeldiniz</h3>
    <%}%>
    saat suan : <%= new java.util.Date()%>


    <%--     INTEGER TANIMLAMA         --%>
    <%!
      int sayi;
      double kesir;
    %>
    <%
      sayi = 55;
      kesir = 10.9;
    %>
  <br/>
    tamsayi = <%= sayi%><br/>
    kesirli sayi = <%= kesir%><br>

  <%--     STRING TANIMLAMA       --%>


    <%!
      String isim = "Orkhan";
      String soyisim = "Aliyev";
    %>

      isim = <%= isim %><br>
      soyisim = <%= soyisim%>
  </body>
</html>
