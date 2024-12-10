package com.example.bilabonnement.Controller;

import com.example.bilabonnement.Service.RapportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/rapport")
@Controller
public class RapportController {
@Autowired
RapportService rapportService;
@GetMapping("/rapportudbeding")
    public String index(Model model){
    model.addAttribute("rapporter",rapportService.fetchAllRapport());
    return "home/skadeudbeding";
}

}
