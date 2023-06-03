<%-- 
    Document   : virtuelni
    Created on : Feb 18, 2023, 9:03:48 PM
    Author     : Buksnic
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>JSP Page</title>
        <script src="script.js"></script>
      
    </head>
    <body onload="dodajFunkciju()">
        <h1>Izaberite specifikacije</h1>
        <form action="ZakupVirtuelnogServlet" method="post" style="text-align: center;padding: 50px">
            <div style="width: 510px;float: left"><h2>Način plaćanja</h2>
                <div style="width: 100px;float: left">Mesecno 7$<br> <input type="radio" name="placanje" value="7" checked="checked" ></div>
                <div style="width: 110px;float: left">Kvartalno 20$<br><input type="radio" name="placanje" value="20" ></div> 
                <div style="width: 100px;float: left">6 meseci 37$<br><input type="radio" name="placanje" value="37" ></div>
               <div style="width: 100px;float: left">Godisnje 67$<br><input type="radio" name="placanje" value="67" ></div>
              
            </div>
            <div style="width: 500px;float: left;padding-left: 100px"><h2>Izaberite operativni sistem</h2>
            <select name="os">
                <option>Ubuntu 22</option>
                <option>RockyLinux 8</option>
                <option>AlmaLinux 9</option>
                <option>CentOS 7</option>
            </select>
               
            </div>
             <hr style="width: 95%">
             
             <div style="width: 1000px;float: left ;padding-left: 100px"> <h2>Broj jezgara</h2>
                
                <div style="width: 200px;float: left" >2 Cores<input type="radio" name="brjezgara" value="0" checked="checked"></div>
                    <div style="width: 200px;float: left" >+1 Core<input type="radio" name="brjezgara" value="3"></div>
                    <div style="width: 200px;float: left" >+2 Cores<input type="radio" name="brjezgara" value="6"></div>
                    <div style="width: 200px;float: left" >+3 Cores<input type="radio" name="brjezgara" value="9"></div>
                    <hr style="width: 95%">
            </div>
             <div style="width: 1000px;float: left ;padding-left: 100px"> <h2>Kolicina rama</h2>
                
                    <div style="width: 200px;float: left" >4 GB<input type="radio" name="ram" value="0" checked="checked"></div>
                    <div style="width: 200px;float: left" >+1 GB<input type="radio" name="ram" value="2"></div>
                    <div style="width: 200px;float: left" >+2 GB<input type="radio" name="ram" value="4"></div>
                    <div style="width: 200px;float: left" >+3 GB<input type="radio" name="ram" value="8"></div>
                    <hr style="width: 95%">
            </div>
             <div style="width: 1000px;float: left ;padding-left: 100px"> <h2>Dodatna količina diska</h2>
                
                    <div style="width: 200px;float: left" >50 GB<input type="radio" name="disk" value="0" checked="checked"></div>
                    <div style="width: 200px;float: left" >+20 GB<input type="radio" name="disk" value="3"></div>
                    <div style="width: 200px;float: left" >+40 GB<input type="radio" name="disk" value="6"></div>
                    <div style="width: 200px;float: left" >+80 GB<input type="radio" name="disk" value="12"></div>
                  
                    <hr style="width: 95%">
            </div>
             <div style="width: 1000px;float: left ;padding-left: 100px"> <h2>Protok/brzina</h2>
                
                    <div style="width: 200px;float: left" >10 TB<input type="radio" name="protok" value="0" checked="checked"></div>
                    <div style="width: 200px;float: left" >20 TB<input type="radio" name="protok" value="20"></div>
                    <div style="width: 200px;float: left" >30 TB<input type="radio" name="protok" value="30"></div>
                    <div style="width: 200px;float: left" >40 TB<input type="radio" name="protok" value="40"></div>
                  
                    <hr style="width: 95%">
            </div>
             <div id="ispisiCenu"></div>
                
                 <button type="submit">Zakupi server</button>
             
             <input id="ukupnaCena" name="ukupnaCena" value="7" hidden>
        </form>
        <c:if test="${success!=null && klijent!=null}">
            <div style="height: 60px;text-align: center; font-weight: 40px;">
               
                Korisnik:${klijent.ime}<br>
                <a href="./ZakupVirtuelnogServlet?id=${klijent.id}">Vratite se na izbor dodatnih</a><br>
            </div>
    </body>
</html>
