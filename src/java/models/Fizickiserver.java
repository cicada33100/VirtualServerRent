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
public class Fizickiserver {
    private String cpu;
    private int ram;
    private int brdiskova;
    private int brzina;
    private String tehnologija;
    private int cena;
    public Date datum;
    public Fizickiserver(String cpu, int ram, int brdiskova, int brzina,String tehnologija) {
        this.cpu = cpu;
        this.ram = ram;
        this.brdiskova = brdiskova;
        this.brzina = brzina;
        this.tehnologija = "";
        cena=0;
    }

    public Fizickiserver(String server) {
        String[] s=server.split(",");
        this.cpu = s[0];
        this.ram = Integer.parseInt(s[1]);
        this.brdiskova = Integer.parseInt(s[2]);
        this.brzina = Integer.parseInt(s[3]);
        this.tehnologija = s[4];
        datum=null;
    }

    @Override
    public String toString() {
        return cpu+","+ram +","+ brdiskova +","+ brzina +","+ tehnologija ;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getBrdiskova() {
        return brdiskova;
    }

    public void setBrdiskova(int brdiskova) {
        this.brdiskova = brdiskova;
    }

    public int getBrzina() {
        return brzina;
    }

    public void setBrzina(int brzina) {
        this.brzina = brzina;
    }

    public String getTehnologija() {
        return tehnologija;
    }

    public void setTehnologija(String tehnologija) {
        this.tehnologija = tehnologija;
    }
}
