/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */
function izracunajCenu(){
    let cekirani=document.querySelectorAll("input[type='radio']");
    let ukupnaCena=0;
    for(let i=0;i<cekirani.length;i++){
        if (cekirani[i].checked) {
            let cekiran=parseInt(cekirani[i].getAttribute("value"));
            ukupnaCena+=cekiran;
        }
    }
    let ispisiCenu=document.querySelector("#ispisiCenu");
    ispisiCenu.innerHTML="Ukupna cena je: "+ ukupnaCena;
    document.querySelector("#ukupnaCena").value=ukupnaCena;
}

function dodajFunkciju(){
    let cekirani=document.querySelectorAll("input[type='radio']");
for(let i=0;i<cekirani.length;i++){
     
      cekirani[i].onchange=izracunajCenu;
}
}

