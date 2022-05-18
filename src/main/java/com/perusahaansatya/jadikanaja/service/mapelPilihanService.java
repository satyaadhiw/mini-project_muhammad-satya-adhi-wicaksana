package com.perusahaansatya.jadikanaja.service;

import com.perusahaansatya.jadikanaja.entity.mapelPilihan;
import com.perusahaansatya.jadikanaja.repository.mapelPilihanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class mapelPilihanService {

    @Autowired
    private mapelPilihanRepository repository;

    public List<mapelPilihan> daftarMapel(){
        return repository.findAll();
    }
}
