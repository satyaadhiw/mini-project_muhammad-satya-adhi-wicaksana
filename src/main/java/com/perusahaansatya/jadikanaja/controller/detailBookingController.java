package com.perusahaansatya.jadikanaja.controller;

import com.perusahaansatya.jadikanaja.entity.detailBooking;
import com.perusahaansatya.jadikanaja.service.detailBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class detailBookingController {

    @Autowired
    private detailBookingService service;

    @GetMapping("/detailBooking/{id}")
    public detailBooking cariDetailBooking(@PathVariable int id){
        return service.cariDetailBooking(id);
    }

    @PostMapping("/tambahDetailBooking")
    public detailBooking tambahDetailBooking(@RequestBody detailBooking detailBooking){
        return service.tambahDetailBooking(detailBooking);
    }
}
