package com.example.bilabonnement.Service;

import com.example.bilabonnement.Model.Rapport;
import com.example.bilabonnement.Repository.LejeaftaleRepository;
import com.example.bilabonnement.Repository.RapportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RapportService {
    @Autowired
    RapportRepository rapportRepository;
    public RapportService(RapportRepository rapportRepository ){
        this.rapportRepository=rapportRepository;
    }
    public List<Rapport> fetchAllRapport(){
        return rapportRepository.fetchAllRapport();
    }
    public void addRapport(Rapport r) {
        rapportRepository.addRapport(r);}

    public Rapport findRapportByID(int rapportID){
        return rapportRepository.findRapportByID(rapportID);
    }
    public Boolean deleteRapport(int rapportID){
        return rapportRepository.deleteRapport(rapportID);
    }
    public void updateRapport(Rapport r){
        rapportRepository.updateRapport(r);
    }
}


