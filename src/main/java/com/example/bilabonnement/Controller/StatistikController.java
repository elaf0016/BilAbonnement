package com.example.bilabonnement.Controller;

import com.example.bilabonnement.Model.Bil;
import com.example.bilabonnement.Service.StatistikService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/statistik")
public class StatistikController {

    @Autowired
    private StatistikService statistikService;

    @GetMapping
    public String visStatistik(Model model) {
        // Hent antal udlejede biler og samlet pris
        int antalLejedeBiler = statistikService.hentAntalLejedeBiler();
        double samletPris = statistikService.hentSamletPrisForLejedeBiler();

        // Hent liste over udlejede biler
        List<Bil> udlejedeBiler = statistikService.hentUdlejedeBiler();

        // Tilføj data til modellen
        model.addAttribute("antalLejedeBiler", antalLejedeBiler);
        model.addAttribute("samletPris", samletPris);
        model.addAttribute("udlejedeBiler", udlejedeBiler);

        // Returner Thymeleaf-skabelon
        return "home/statistik";
    }
}
