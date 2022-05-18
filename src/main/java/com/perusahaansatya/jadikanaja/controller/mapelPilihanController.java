package com.perusahaansatya.jadikanaja.controller;

import com.perusahaansatya.jadikanaja.entity.mapelPilihan;
import com.perusahaansatya.jadikanaja.service.mapelPilihanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class mapelPilihanController {

    @Autowired
    private mapelPilihanService service;

    @GetMapping("/mapel")
    public List<mapelPilihan> mapel(){
        return service.daftarMapel();
    }
}
