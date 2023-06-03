<%-- 
    Document   : izmeni
    Created on : 08.02.2023., 15:52:29
    Author     : PC
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
        <h1>Promenite konfiguracije servera</h1>
    <c:if test="${zakup!=null}">Vaša trenutna konfiguracija servera je:<br> ${zakup.server.getOpis()}</c:if>
    <form action="IzmeniServlet" method="POST">
            <div class="container">
            <div class="row">
                <div class="col-12 text-center display-6">
                    Način plaćanja
                </div>
                <hr>
                <div class="col-3">Mesečno 7<input type="radio" name="placanje" value="7" checked="checked" ></div>
                    <div class="col-3">Kvartalno 20<input type="radio" name="placanje" value="20" ></div>
                    <div class="col-3">Polu-godišnje 37<input type="radio" name="placanje" value="37" ></div>
                    <div class="col-3">Godišnje 67<input type="radio" name="placanje" value="67" ></div>
            </div>
                <div class="row justify-content-center">
                    <div class="col-12 text-center display-6">Izaberite operativni sistem</div>
                   
                    <select class="col-4" name="os">
                        <option>Ubuntu 22</option>
                        <option>RockyLinux 8</option>
                        <option>AlmaLinux 9</option>
                        <option>CentOS 7</option>
                    </select>
                </div>
                <div class="row">
                <div class="col-12 text-center display-6">
                    Broj jezgara
                </div>
                <hr>
                <div class="col-3">2 Cores<input type="radio" name="brjezgara" value="0" checked="checked"></div>
                    <div class="col-3">+1 Core<input type="radio" name="brjezgara" value="3"></div>
                    <div class="col-3">+2 Cores<input type="radio" name="brjezgara" value="6"></div>
                    <div class="col-3">+3 Cores<input type="radio" name="brjezgara" value="9"></div>
            </div>
                <div class="row">
                <div class="col-12 text-center display-6">
                    Količina rama
                </div>
                <hr>
                <div class="col-3">4 GB<input type="radio" name="ram" value="0" checked="checked"></div>
                    <div class="col-3">+1 GB<input type="radio" name="ram" value="2"></div>
                    <div class="col-3">+2 GB<input type="radio" name="ram" value="4"></div>
                    <div class="col-3">+4 GB<input type="radio" name="ram" value="8"></div>
            </div>
                <div class="row">
                <div class="col-12 text-center display-6">
                    Dodatna količina diska
                </div>
                <hr>
                <div class="col-3">50 GB<input type="radio" name="disk" value="0" checked="checked"></div>
                    <div class="col-3">+20 GB<input type="radio" name="disk" value="3"></div>
                    <div class="col-3">+40 GB<input type="radio" name="disk" value="6"></div>
                    <div class="col-3">+80 GB<input type="radio" name="disk" value="12"></div>
            </div>
                <div class="row">
                <div class="col-12 text-center display-6">
                    Protok
                </div>
                <hr>
                <div class="col-3">10TB<input type="radio" name="protok" value="0" checked="checked"></div>
                    <div class="col-3">20TB<input type="radio" name="protok" value="10"></div>
                    <div class="col-3">30TB<input type="radio" name="protok" value="20"></div>
                    <div class="col-3">40 TB<input type="radio" name="protok" value="30"></div>
            </div>
            
                <div id="ispisiCenu"></div>
                
                
               
                    <button type="submit">Izmeni server</button>
                
                
                   
                
           
            <input id="ukupnaCena" name="ukupnaCena" value="7" hidden>
             </div>
        </form>
    </body>
</html>
