package com.perusahaansatya.jadikanaja.controller;

import com.perusahaansatya.jadikanaja.entity.Booking;
import com.perusahaansatya.jadikanaja.entity.detailBooking;
import com.perusahaansatya.jadikanaja.service.bookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class bookingController {

    @Autowired
    private bookingService service;

    @GetMapping("/booking/{id}")
    public Booking cariBooking(@PathVariable int id){
        return service.cariBooking(id);
    }


    @PostMapping("/tambahBooking")
    public Booking tambahBooking(@RequestBody Booking booking){
        return service.tambahBooking(booking);
    }
}
