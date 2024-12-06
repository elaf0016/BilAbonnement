package com.example.bilabonnement.Model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "lejeaftale")
public class Lejeaftale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int lejeaftale_id;
    private int kunde_nr;
    private String stelnummer;
    @DateTimeFormat(pattern = "yyyy-MM-dd")

    private Date start_dato;
    @DateTimeFormat(pattern = "yyyy-MM-dd")

    private Date slut_dato;
    private double pris;
    public Lejeaftale(){

    }
    public Lejeaftale(int lejeaftale_id, int kunde_nr, String stelnummer, Date start_dato, Date slut_dato, double pris) {
        this.lejeaftale_id = lejeaftale_id;
        this.kunde_nr = kunde_nr;
        this.stelnummer = stelnummer;
        this.start_dato = start_dato;
        this.slut_dato = slut_dato;
        this.pris = pris;
    }

    public int getLejeaftale_id() {
        return lejeaftale_id;
    }

    public void setLejeaftale_id(int lejeaftale_id) {
        this.lejeaftale_id = lejeaftale_id;
    }

    public int getKunde_nr() {
        return kunde_nr;
    }

    public void setKunde_nr(int kunde_nr) {
        this.kunde_nr = kunde_nr;
    }

    public String getStelnummer() {
        return stelnummer;
    }

    public void setStelnummer(String stelnummer) {
        this.stelnummer = stelnummer;
    }

    public Date getStart_dato() {
        return start_dato;
    }

    public void setStart_dato(Date start_dato) {
        this.start_dato = start_dato;
    }

    public Date getSlut_dato() {
        return slut_dato;
    }

    public void setSlut_dato(Date slut_dato) {
        this.slut_dato = slut_dato;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }
}