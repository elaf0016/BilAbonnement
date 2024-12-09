package com.example.bilabonnement.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="skade")
public class Skade {
    @Id
    private int skadeId;
    private int rapportID;
    private double pris;
    public Skade(){}

    public Skade(int skadeId, int rapportID, double pris) {
        this.skadeId = skadeId;
        this.rapportID = rapportID;
        this.pris = pris;
    }

    public int getSkadeId() {
        return skadeId;
    }

    public void setSkadeId(int skadeId) {
        this.skadeId = skadeId;
    }

    public int getRapportID() {
        return rapportID;
    }

    public void setRapportID(int rapportID) {
        this.rapportID = rapportID;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }
}
