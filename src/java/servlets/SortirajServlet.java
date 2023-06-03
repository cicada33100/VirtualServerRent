package servlets;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */


import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import models.Data;
import models.Fizickiserver;
import models.Fizickolice;

/**
 *
 * @author Buksnic
 */
public class SortirajServlet extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        int cena=0;
        request.setAttribute("lica",Data.lica);
//        Fizickolice pom;
//        for(int i =0;i<Data.lica.size();i++){
//            for(int j =i+1;j<Data.lica.size()-1;j++){
//            for(int k=0;k<Data.lica.get(i).getServeri().size();k++){
//               for(int l=k+1;l<Data.lica.get(l).getServeri().size()-1;l++){
//                
//                
//                if(Data.lica.get(i).getServeri().get(k).getCena() < Data.lica.get(j).getServeri().get(l).getCena()){
//                    Data.lica.get(i).getServeri().set(k,Data.lica.get(j).getServeri().get(l));
//                    
//                    }
//            }
//            }
//        }
            ArrayList<Fizickiserver> serveri = new ArrayList<Fizickiserver>();
             for(int i =0;i<Data.lica.size();i++){
                 for(int k=0;k<Data.lica.get(i).getServeri().size();k++){
                 serveri.add(Data.lica.get(i).getServeri().get(k));
                         
                         }
             }
             Fizickiserver pom;
             for(int i =0;i<serveri.size();i++){
                 for(int j=i+1;j<serveri.size()-1;j++){
                 if(serveri.get(i).getCena()<serveri.get(j).getCena()){
                     pom=serveri.get(i);
                     serveri.set(i,serveri.get(j));
                     serveri.set(j, pom);
                 
                 }
                 }
             
             }
             request.setAttribute("serveri", serveri);
        
        
        request.getRequestDispatcher("sortiraj.jsp").forward(request, response);
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
