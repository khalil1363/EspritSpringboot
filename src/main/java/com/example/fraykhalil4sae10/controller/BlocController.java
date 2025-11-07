package com.example.fraykhalil4sae10.controller;

import com.example.fraykhalil4sae10.model.Bloc;
import com.example.fraykhalil4sae10.services.IBlocService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Blocs")
@AllArgsConstructor
public class BlocController {
    private final IBlocService blocService;

    @PostMapping("/add")
    public Bloc ajouterBloc(@RequestBody Bloc bloc) {
        return blocService.addBloc(bloc);
    }

    @PutMapping("/update")
    public Bloc modifierBloc(@RequestBody Bloc bloc) {
        return blocService.updateBloc(bloc);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBloc(@PathVariable Long id) {
        blocService.deleteBloc(id);
    }

    @GetMapping("/getone/{id}")
    public Bloc getBlocById(@PathVariable Long id) {
        return blocService.getBlocById(id);
    }

    @GetMapping("/getall")
    public List<Bloc> getAllBlocs() {
        return blocService.allBlocs();
    }
    @GetMapping("/byName/{nomBloc}")
    public Bloc findByNomBloc(@PathVariable String nomBloc) {
        return blocService.findByNomBloc(nomBloc);
    }

    @GetMapping("/search/{nomPart}")
    public List<Bloc> findByNomBlocContaining(@PathVariable String nomPart) {
        return blocService.findByNomBlocContaining(nomPart);
    }

    @GetMapping("/capaciteLessThan/{cap}")
    public List<Bloc> findByCapaciteBlocLessThan(@PathVariable long cap) {
        return blocService.findByCapaciteBlocLessThan(cap);
    }

    @GetMapping("/capaciteBetween/{min}/{max}")
    public List<Bloc> findByCapaciteBlocBetween(@PathVariable long min, @PathVariable long max) {
        return blocService.findByCapaciteBlocBetween(min, max);
    }
}