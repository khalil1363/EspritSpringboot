package com.example.fraykhalil4sae10.controller;

import com.example.fraykhalil4sae10.model.Etudiant;
import com.example.fraykhalil4sae10.services.IEtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Etudiants")
@AllArgsConstructor
public class EtudiantController {
    private final IEtudiantService etudiantService;

    @PostMapping("/add")
    public Etudiant ajouterEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.addEtudiant(etudiant);
    }

    @PutMapping("/update")
    public Etudiant modifierEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.updateEtudiant(etudiant);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEtudiant(@PathVariable Long id) {
        etudiantService.deleteEtudiant(id);
    }

    @GetMapping("/getone/{id}")
    public Etudiant getEtudiantById(@PathVariable Long id) {
        return etudiantService.getEtudiantById(id);
    }

    @GetMapping("/getall")
    public List<Etudiant> getAllEtudiants() {
        return etudiantService.allEtudiants();
    }
        @GetMapping("/nom")
        public List<Etudiant> getByNom(@RequestParam String nom) {
            return etudiantService.getByNom(nom);
        }

    @GetMapping("/ecole-native")
    public List<Etudiant> getEtudiantsByEcoleNative(@RequestParam String ecole) {
        return etudiantService.getEtudiantsByEcoleNative(ecole);
    }
    }