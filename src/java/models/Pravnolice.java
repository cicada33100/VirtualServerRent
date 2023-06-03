/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author Buksnic
 */
public class Pravnolice extends Fizickolice {
    private ArrayList<Fizickiserver> serveri;
    private String naziv;

    public Pravnolice(ArrayList<Fizickiserver> serveri, String naziv) {
        this.serveri = serveri;
        this.naziv = naziv;
    }

    public Pravnolice(String naziv, String ime, String prezime, String adresa) {
        super(ime, prezime, adresa);
        this.serveri = new ArrayList<Fizickiserver>();
        this.naziv = naziv;
    }

    public ArrayList<Fizickiserver> getServeri() {
        return serveri;
    }

    public void setServeri(ArrayList<Fizickiserver> serveri) {
        this.serveri = serveri;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

   
    

    

    


   

    
   
    
}
