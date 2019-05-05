<%-- 
    Document   : cevap
    Created on : Jul 5, 2018, 9:45:22 AM
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
        <jsp:useBean id="ilkCekirdek" scope="session" class="data.Kisi" />
        <jsp:setProperty name="ilkCekirdek" property="isim" />
        Merhaba
        <jsp:getProperty name="ilkCekirdek" property="isim" />
        siteme hosgeldin!
    </body>
</html>
