package com.example.bilabonnement.Model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bil")
public class Bil {
    @Id
    private String stelnummer;

    private String mærke;

    private String model;

    private String brandstof;

    private int odometer;



public Bil(){}

public Bil(String stelnummer, String mærke, String model, String brandstof, int odometer) {
    this.stelnummer = stelnummer;
    this.mærke = mærke;
    this.model = model;
    this.brandstof = brandstof;
    this.odometer = odometer;

}



    public String getStelnummer() {
        return stelnummer;
    }

    public void setStelnummer(String stelnummer) {
        this.stelnummer = stelnummer;
    }

    public String getMærke() {
        return mærke;
    }

    public void setMærke(String mærke) {
        this.mærke = mærke;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrandstof() {
        return brandstof;
    }

    public void setBrandstof(String brandstof) {
        this.brandstof = brandstof;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }


}