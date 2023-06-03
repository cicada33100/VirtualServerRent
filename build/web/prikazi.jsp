<%-- 
    Document   : prikazi
    Created on : Feb 21, 2023, 3:05:40 PM
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
        <h1>krajjjjjjjjjjjjjjjjjjjj</h1>
        <c:if test="${lica!=null}">
            <c:forEach items="${lica} var="lice" varStatus="loop">
            ${lice.ime} ${lice.prezime} ${lice.adresa}<br>
            <c:if test="${lice.serveri!=null}">
            <c:forEach items="${lice.serveri}" var="s" varStatus="loop">
                ${s.cpu} procesor ${s.ram} GM RAm ${s.brdiskova} BRDISKOVA ${s.brzina} SPEED ${s.tehnologija} ${s.cena}eura
                
            </c:forEach>
                </c:if>
            </c:forEach>
            ${suma}=ukupnooo;
            
        </c:if>
    </body>
</html>
