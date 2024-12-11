package com.example.bilabonnement.Controller;

import com.example.bilabonnement.Service.StatistikService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/statistik")
public class StatistikController {

    @Autowired
    private StatistikService statistikService;

    @GetMapping
    public String visStatistik(Model model) {
        int antalLejedeBiler = statistikService.hentAntalLejedeBiler();
        double samletPris = statistikService.hentSamletPrisForLejedeBiler();

        model.addAttribute("antalLejedeBiler", antalLejedeBiler);
        model.addAttribute("samletPris", samletPris);

        return "home/statistik"; // Thymeleaf template navn
    }
}

