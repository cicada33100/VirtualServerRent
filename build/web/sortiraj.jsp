<%-- 
    Document   : sortiraj
    Created on : Feb 21, 2023, 5:43:03 PM
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
        <h1>sortiranje po ceni</h1>
        <c:if test="${serveri!=null}">
            <c:forEach items="${serveri} var="s" varStatus="loop">
                ${s.cpu} procesor ${s.ram} GM RAm ${s.brdiskova} BRDISKOVA ${s.brzina} SPEED ${s.tehnologija} <br>
                ${s.cena}eura
            
            
            </c:foreach>
       </c:if>
        
        
    </body>
</html>
