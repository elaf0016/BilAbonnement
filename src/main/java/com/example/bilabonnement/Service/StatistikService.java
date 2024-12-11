package com.example.bilabonnement.Service;

import com.example.bilabonnement.Repository.StatistikRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatistikService {

    @Autowired
    private StatistikRepository statistikRepository;

    public int hentAntalLejedeBiler() {
        return statistikRepository.findAntalLejedeBiler();
    }

    public double hentSamletPrisForLejedeBiler() {
        return statistikRepository.findSamletPrisForLejedeBiler();
    }
}
