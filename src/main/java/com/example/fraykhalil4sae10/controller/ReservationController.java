package com.example.fraykhalil4sae10.controller;

import com.example.fraykhalil4sae10.model.Reservation;
import com.example.fraykhalil4sae10.services.IReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/Reservations")
@AllArgsConstructor
public class ReservationController {
    private final IReservationService reservationService;

    @PostMapping("/add")
    public Reservation ajouterReservation(@RequestBody Reservation reservation) {
        return reservationService.addReservation(reservation);
    }

    @PutMapping("/update")
    public Reservation modifierReservation(@RequestBody Reservation reservation) {
        return reservationService.updateReservation(reservation);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteReservation(@PathVariable String id) {
        reservationService.deleteReservation(id);
    }

    @GetMapping("/getone/{id}")
    public Reservation getReservationById(@PathVariable String id) {
        return reservationService.getReservationById(id);
    }

    @GetMapping("/getall")
    public List<Reservation> getAllReservations() {
        return reservationService.allReservations();
    }
}