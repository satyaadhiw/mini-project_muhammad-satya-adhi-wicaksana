package com.perusahaansatya.jadikanaja.service;


import com.perusahaansatya.jadikanaja.entity.detailBooking;
import com.perusahaansatya.jadikanaja.repository.detailBookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class detailBookingService {

    @Autowired
    private detailBookingRepository repository;


    public detailBooking cariDetailBooking(int id){
        return repository.findById(id).orElse(null);
    }

    public detailBooking tambahDetailBooking(detailBooking detailBooking){
        return repository.save(detailBooking);
    }


}
