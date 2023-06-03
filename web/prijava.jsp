<%-- 
    Document   : prijava.jsp
    Created on : Feb 18, 2023, 1:38:32 PM
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
        <h1>Izaberite fizicko ili pravno lice</h1>
       <form method="POST" action="PrijavaServelet">
        <input type="radio" name="lice" id="lice" value="fizicko" checked="checked" onclick="prikaziInput(true)">Fizičko lice
        <input type="radio" name="lice" id="lice" value="pravno" onclick="prikaziInput(false)">Pravno lice<br><br>
        <input name="ime" id="ime" placeholder="Unesite Vaše ime/ime ovlašćenog lica"><br><br> 
        <input name="prezime" id="prezime" placeholder="Unesite Vaše prezime/prezime ovlašćenog lica"><br><br> 
        <input name="adresa" id="adresa" placeholder="Unesite Vašu adresu/sedište kompanije"><br><br>
        <input style="display:none" name="naziv" id="naziv" placeholder="Unesite naziv kompanije"><br><br>

        <button type="submit">Snimi</button>
        
        <c:if test="${success!=null}">
            <div>Izaberite vrstu servera koju zelite da zakupite<br>
            <a href="./ZakupFizickogServlet?id=${success.id}">Fizicki server</a><br>
            <a href="./ZakupVirtuelnogServlet?id=${success.id}">Virtuelni server</a><br>
      
        </div>
        </c:if>
    </form>
        
        <script>
            function prikaziInput(x){
                
                if(x!=true){
                 let naziv=document.getElementById("naziv");
                 naziv.style.display='block';
                }else{
                    naziv.style.display='none';
                }
                
                
            }
            let btn = document.querySelector()
            
        </script>
            
 
        
        
    </body>
</html>
