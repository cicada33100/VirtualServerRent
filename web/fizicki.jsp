<%-- 
    Document   : fizicki.jsp
    Created on : Feb 18, 2023, 3:55:47 PM
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
        <h1>Izaberite specifikacije</h1>
        <c:if test="${redirect!=null && klijent!=null}">
            <div style="border-color: green;border-style: solid; border-radius: 5px;height: 60px;text-align: center; font-weight: 40px; background-color: lightblue">
                Uspesno ste kupili server<br>
                Korisnik:${klijent.ime}<br>
                <a href="./ZakupFizickogServlet?id=${klijent.id}">Vratite se na izbor dodatnih</a><br>
            </div>
            
        </c:if>
         <c:forEach items="${lista}" var="l" varStatus="loop">
             <div>
                 ${l.getCpu()}<br>
                 ${l.getRam()} GB RAMA<br>
                 ${l.getBrdiskova()} Disck Drives<br>
                 ${l.getBrzina()} Gbsps Shared Bandwith<br>
                 ${l.getTehnologija()}
                 
                 <br>${l.getCena()}
                 <button><a href="./Kupi?id=${id}&&vrsta=${loop.index}">Kupi</a></button>
                 <hr>
             </div>    
         </c:forEach>
        
    </body>
</html>
