<%-- 
    Document   : empty
    Created on : Jul 9, 2018, 6:00:29 PM
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
            String yeniIsim = (String)oturum.getAttribute("oturumismi");
            out.print("Degisen oturumdaki isim: " + yeniIsim);
            
        %>
    </body>
</html>
