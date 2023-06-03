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
import models.Data;
import models.Fizickiserver;
import models.Fizickolice;

/**
 *
 * @author Buksnic
 */
public class Kupi extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        Fizickiserver s1=new Fizickiserver("Intel i3 - 7100",8,2,1,"Software Raid");
        s1.setCena(29);
         Fizickiserver s2=new Fizickiserver("Intel E3-1240",16,4,1,"Software Raid");
         s2.setCena(49);
         Fizickiserver s3=new Fizickiserver("Intel E5-2430",16,4,1,"Hardware Raid");
         s3.setCena(59);
         int id=Integer.parseInt(request.getParameter("id"));
         int vrsta=Integer.parseInt(request.getParameter("vrsta"));
         Fizickolice f= new Fizickolice();
         
         for(int i =0;i<Data.lica.size();i++){
             if(Data.lica.get(i).getId()==id){
                 f=Data.lica.get(i);
             }
         
         } 
                switch (vrsta){
                    case 0: f.getServeri().add(s1);
                    request.setAttribute("klijent", f);
                    break;
                    case 1: f.getServeri().add(s2);
                    request.setAttribute("klijent", f);
                    break;
                    case 2: f.getServeri().add(s3);
                    request.setAttribute("klijent", f);
                    break;
                }
             
         
         request.setAttribute("redirect", "redirect");
         
         request.getRequestDispatcher("fizicki.jsp").forward(request, response);
        
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
        processRequest(request, response);
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
