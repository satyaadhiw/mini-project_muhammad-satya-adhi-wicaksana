package com.perusahaansatya.jadikanaja.service;

import com.perusahaansatya.jadikanaja.entity.Booking;
import com.perusahaansatya.jadikanaja.repository.bookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class bookingService {

    @Autowired
    private bookingRepository repository;

    public Booking cariBooking(int id){
        return repository.findById(id).orElse(null);
    }

    public Booking tambahBooking(Booking booking){
        return repository.save(booking);
    }

}
