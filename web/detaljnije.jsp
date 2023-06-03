<%-- 
    Document   : detaljnije
    Created on : Feb 21, 2023, 2:04:24 PM
    Author     : Buksnic
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:if test="${lice!=null}">
            ${lice.ime} ${lice.prezime} ${lice.adresa}<br>
            <c:forEach items="${lice.serveri}" var="s" varStatus="loop">
                ${s.cpu} procesor ${s.ram} GM RAm ${s.brdiskova} BRDISKOVA ${s.brzina} SPEED ${s.tehnologija} ${s.cena}eura
                
                
            </c:forEach>
            
            
        </c:if>
    </body>
</html>
