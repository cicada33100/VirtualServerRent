/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Date;

/**
 *
 * @author Buksnic
 */
public class Virutelniserver extends Fizickiserver{
    private Date datumpoc;
    private Date datumkraja;
    private String operativnisis;
    private int cena;
    public Virutelniserver( Date datumkraja, String operativnisis, String cpu, int ram, int brdiskova, int brzina, String tehnologija) {
        super(cpu, ram, brdiskova, brzina, tehnologija);
        this.datumpoc = new Date();
        this.datumkraja = datumkraja;
        this.operativnisis = operativnisis;
        cena=0;
    }
    
    

    public String getOperativnisis() {
        return operativnisis;
    }

    public void setOperativnisis(String operativnisis) {
        this.operativnisis = operativnisis;
    }

    public Date getDatumpoc() {
        return datumpoc;
    }

    public void setDatumpoc(Date datumpoc) {
        this.datumpoc = datumpoc;
    }

    public Date getDatumkraja() {
        return datumkraja;
    }

    public void setDatumkraja(Date datumkraja) {
        this.datumkraja = datumkraja;
    }
    
}
