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
public class Fizickolice {
    private static int id=0;
    private String ime;
    private String prezime;
    private String adresa;
    ArrayList<Fizickiserver> serveri;

    public Fizickolice() {
     }

    public ArrayList<Fizickiserver> getServeri() {
        return serveri;
    }

    public void setServeri(ArrayList<Fizickiserver> serveri) {
        this.serveri = serveri;
    }

    public Fizickolice( String ime, String prezime, String adresa) {
        id++;
        this.ime = ime;
        this.prezime = prezime;
        this.adresa = adresa;
        this.serveri = new ArrayList<Fizickiserver>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

   
    
}
