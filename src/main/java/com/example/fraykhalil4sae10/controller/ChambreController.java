package com.example.fraykhalil4sae10.controller;

import com.example.fraykhalil4sae10.model.Chambre;
import com.example.fraykhalil4sae10.model.TypeChambre;
import com.example.fraykhalil4sae10.services.IchambreServise;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Tag(name="Gestion des chambre", description="crud des chambre")
@RestController
@RequestMapping("/Chambres")
@AllArgsConstructor///  tjiblena constructor bech na3mlou injection with constructor men 4ir @Autowired
public class ChambreController {
    private final IchambreServise chambreService; ///teb3A injection par constructor
    ///
@Operation(summary="ajouter chambbre")
@PostMapping("/add")
    public Chambre ajouterChambre(@RequestBody Chambre chambre){
    return chambreService.addChambre(chambre);
}

@PutMapping("/update")
    public Chambre modifier(@RequestBody Chambre chambre){
    return chambreService.updateChambre(chambre);
}

@DeleteMapping("/delete/{id}")
    public void deletechambre(@PathVariable Long id)
{
    chambreService.deleteChambre(id);
}
    @GetMapping("getone/{id}")
    public Chambre getChambreById(@PathVariable Long id) {
        return chambreService.getChambreById(id);
    }
    @GetMapping("/getall")
    public List<Chambre> getAllChambres() {
        return chambreService.allchambre();
    }


    @GetMapping("/and/{numero}/{type}")
    public List<Chambre> findByNumeroAndType(@PathVariable long numero, @PathVariable TypeChambre type) {
        return chambreService.findByNumeroChambreAndTypechambre(numero, type);
    }

    @GetMapping("/or/{numero}/{type}")
    public List<Chambre> findByNumeroOrType(@PathVariable long numero, @PathVariable TypeChambre type) {
        return chambreService.findByNumeroChambreOrTypechambre(numero, type);
    }

    @GetMapping("/greaterThan/{numero}")
    public List<Chambre> findByNumeroGreaterThan(@PathVariable long numero) {
        return chambreService.findByNumeroChambreGreaterThan(numero);
    }

    @GetMapping("/between/{min}/{max}")
    public List<Chambre> findByNumeroBetween(@PathVariable long min, @PathVariable long max) {
        return chambreService.findByNumeroChambreBetween(min, max);
    }
    @GetMapping("/start/{prefix}")
    public List<Chambre> getChambresStartingWith(@PathVariable String prefix) {
        return chambreService.findByTypeStartingWith(prefix);
    }

    @GetMapping("/type-bloc")
    public List<Chambre> getChambresByTypeAndBloc(
            @RequestParam TypeChambre type,
            @RequestParam String nomBloc) {
        return chambreService.getChambresByTypeAndBloc(type, nomBloc);
    }
    @GetMapping("/disponibles-native")
    public List<Chambre> getChambresDisponiblesNative() {
        return chambreService.getChambresDisponiblesNative();
    }
}
