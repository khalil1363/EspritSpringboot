package com.example.fraykhalil4sae10.controller;

import com.example.fraykhalil4sae10.model.Universite;
import com.example.fraykhalil4sae10.services.IUniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Universites")
@AllArgsConstructor
public class UniversiteController {

    private final IUniversiteService universiteService;

    @PostMapping("/ajouter")
    public Universite ajouterUniversite(@RequestBody Universite universite) {
        return universiteService.addUniversite(universite);
    }

    @PutMapping("/modifer")
    public Universite modifierUniversite(@RequestBody Universite universite) {
        return universiteService.updateUniversite(universite);
    }

    @DeleteMapping("/delete/{id}")
    public void supprimerUniversite(@PathVariable Long id) {
        universiteService.deleteUniversite(id);
    }

    @GetMapping("/getone/{id}")
    public Universite getUniversiteById(@PathVariable Long id) {
        return universiteService.getUniversiteById(id);
    }

    @GetMapping("/getall")
    public List<Universite> getAllUniversites() {
        return universiteService.allUniversites();
    }
}
