package com.example.fraykhalil4sae10.services;

import com.example.fraykhalil4sae10.model.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation addReservation(Reservation reservation);
    Reservation updateReservation( Reservation reservation);
    void deleteReservation(String id);
    Reservation getReservationById(String id);
    List<Reservation> allReservations();
}