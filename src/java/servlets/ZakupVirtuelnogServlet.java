/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Calendar;
import java.util.Date;
import models.Data;
import models.Fizickolice;
import models.Virutelniserver;

/**
 *
 * @author Buksnic
 */
public class ZakupVirtuelnogServlet extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        request.getRequestDispatcher("virtuelni.jsp").forward(request, response);
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
        
       
        double cenaZakupa=Double.parseDouble(request.getParameter("ukupnaCena"));
        int placanje=Integer.parseInt(request.getParameter("placanje"));
        String os=request.getParameter("os");
        int brjezgara=Integer.parseInt(request.getParameter("brjezgara"));
        int ram=Integer.parseInt(request.getParameter("ram")); 
        int disk=Integer.parseInt(request.getParameter("disk"));
        int protok=Integer.parseInt(request.getParameter("protok"));
        Date datumkraja=new Date();
         Calendar calendar = Calendar.getInstance();
        calendar.setTime(datumkraja);
       int cena=7;
        String cpu;
        int ramovi;
        int brdiskova;
        int brzina;
        String tehnologija="";
        switch(placanje){
            case 20:
                calendar.add(Calendar.MONTH, 4);
                datumkraja= calendar.getTime();
                cena=20*4;
                break;
            case 37:
                calendar.add(Calendar.MONTH, 6);
                datumkraja= calendar.getTime();
                cena=37*2;
                break;
            case 67:
                calendar.add(Calendar.MONTH, 12);
                datumkraja= calendar.getTime();
                cena=67;
                break;
            default:
                calendar.add(Calendar.MONTH, 1);
                datumkraja= calendar.getTime();
                cena*=12;
                break;
        }
        switch(brjezgara){
            case 3:
                cpu="Jedno dodatno jezgro<br>"; cena+=3;
                break;
            case 6:
                cpu="Dva dodatna jezgra<br>"; cena+=6;
                break;
            case 9:
                cpu="Tri dodatna jezgra<br>"; cena+=9;
                break;
            default:
                cpu="2 jezgra<br>";
                break;
        }
         switch(ram){
            case 2:
                ramovi=6; cena+=2;
                break;
            case 4:
                ramovi=8; cena+=4;
                break;
            case 8:
                ramovi=10; cena+=6;
                break;
            default:
                ramovi=4;
                break;
        }
        switch(disk){
            case 3:
               brdiskova=70; cena+=4;
                break;
            case 6:
                 brdiskova=90; cena+=6;
                break;
            case 12:
                brdiskova=130; cena+=8;
                break;
            default:
                 brdiskova=50;
                break;
        }
        switch(protok){
            
            case 20:
                brzina=20; cena+=5;
                break;
            case 30:
               brzina=30; cena+=10;
                break;
            case 40:
                brzina=40; cena+=15;
                break;
            default:
               brzina=10;
                break;
        }
        Virutelniserver s = new Virutelniserver(datumkraja,os,cpu,ramovi,brdiskova,brzina,tehnologija);
        Fizickolice f= new Fizickolice(); 
        int id= Data.lica.get(Data.lica.size()-1).getId();
        s.setCena(cena);
        for(int i =0;i<Data.lica.size();i++){
             if(Data.lica.get(i).getId()==id){
                 f=Data.lica.get(i);
             }
         } 
        f.getServeri().add(s);
        
        request.setAttribute("success", "success");
        request.setAttribute("klijent", f);
       request.getRequestDispatcher("virtuelni.jsp").forward(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
