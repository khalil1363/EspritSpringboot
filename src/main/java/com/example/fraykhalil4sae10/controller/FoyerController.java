package com.example.fraykhalil4sae10.controller;

import com.example.fraykhalil4sae10.model.Foyer;
import com.example.fraykhalil4sae10.services.IFoyerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Foyers")
@AllArgsConstructor
public class FoyerController {
    private final IFoyerService foyerService;

    @PostMapping("/add")
    public Foyer ajouterFoyer(@RequestBody Foyer foyer) {
        return foyerService.addFoyer(foyer);
    }

    @PutMapping("/update")
    public Foyer modifierFoyer(@RequestBody Foyer foyer) {
        return foyerService.updateFoyer(foyer);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFoyer(@PathVariable Long id) {
        foyerService.deleteFoyer(id);
    }

    @GetMapping("/getone/{id}")
    public Foyer getFoyerById(@PathVariable Long id) {
        return foyerService.getFoyerById(id);
    }

    @GetMapping("/getall")
    public List<Foyer> getAllFoyers() {
        return foyerService.allFoyers();
    }
}