package com.example.fraykhalil4sae10.controller;

import com.example.fraykhalil4sae10.model.Chambre;
import com.example.fraykhalil4sae10.services.IchambreServise;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Chambres")
@AllArgsConstructor///  tjiblena constructor bech na3mlou injection with constructor men 4ir @Autowired
public class ChambreController {
    private final IchambreServise chambreService; ///teb3A injection par constructor

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
}
