package com.example.bilabonnement.Service;

import com.example.bilabonnement.Model.Bil;
import com.example.bilabonnement.Repository.BilRepository;
import com.example.bilabonnement.Repository.StatistikRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatistikService {

    @Autowired
     StatistikRepository statistikRepository;

    public int hentAntalLejedeBiler() {
        return statistikRepository.findAntalLejedeBiler();
    }

    public double hentSamletPrisForLejedeBiler() {
        return statistikRepository.findSamletPrisForLejedeBiler();
    }


    @Autowired
     BilRepository bilRepository;

    public List<Bil> hentUdlejedeBiler() {
        return bilRepository.findUdlejedeBiler();
    }
}
