<%-- 
    Document   : response
    Created on : Jul 9, 2018, 5:43:24 PM
    Author     : Orkhan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
          HttpSession oturum = request.getSession();
          
          String kullanici = request.getParameter("isim");
          String pass = request.getParameter("sifre");
          
          out.println("Isminiz: " +kullanici);
          out.println("Sifreniz: " + pass);
          oturum.setAttribute("oturumismi", kullanici);
    %>
    <form action="empty.jsp">
        Diger oturuma git
        <input type="submit" value="git" />
    </form>
    </body>
</html>
