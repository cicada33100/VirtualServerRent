<%-- 
    Document   : spisakZakupa
    Created on : Feb 21, 2023, 1:07:06 PM
    Author     : Buksnic
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Spisak lica</h1>
        <form method="POST">
        <c:if test="${!lica.isEmpty()}">
            <select name="id">
                <c:forEach items="${lica}" var="lice" varStatus="loop"><--<!-- OVOO NE ZNAM SOT NECEEEEE -->
                <option value="${lice.id}"> ${lice.ime} ${lice.prezime}</option>
            </c:forEach>    
        </select> <button type="submit">Prikaži</button>
    </c:if>
           
        </form>
    <c:if test="${!lica.isEmpty()}">
    <c:forEach items="${lica}" var="l" varStatus="loop">
    ${l.getServeri()} <strong>|</strong> ${l.server.datumpoc} <c:if test="${l.server.datumkraja!=null}"><c:if test="${l.server.datumkraja.compareTo(today)>0}"><span style="background-color:green;">${l.server.datumkraja}</span></c:if></c:if><br><br>
     <button><a href="./DetaljnijeServlet?id=${l.getId()}">Prikazi detaljnije</a></button>
    <button><a href="./IzmeniServlet?id=${l.serveri}&idLica=${l.lica.getId()}">Izmeni</a></button><br>
    </c:if>
    </body>
</html>
