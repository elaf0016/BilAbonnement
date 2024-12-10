package com.example.bilabonnement.Service;

import com.example.bilabonnement.Model.Lejeaftale;
import com.example.bilabonnement.Model.Skade;
import com.example.bilabonnement.Repository.SkadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkadeService {
    @Autowired
    SkadeRepository skadeRepository;


    public List<Skade> fetchAllSkade() {
        return skadeRepository.fetchAllSkade();
    }
    public void addSkade(Skade s) {
        skadeRepository.addSkade(s);
    }
    public Skade findSkadeBySkadetID(int skadeID) {
        return skadeRepository.findSkadeBySkadeId(skadeID);
    }

}

