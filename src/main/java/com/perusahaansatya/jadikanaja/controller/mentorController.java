package com.perusahaansatya.jadikanaja.controller;

import com.perusahaansatya.jadikanaja.service.mentorService;
import com.perusahaansatya.jadikanaja.entity.Mentor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class mentorController {

    @Autowired
    private mentorService service;

    @GetMapping("/daftarMentor")
    public List<Mentor> daftarMentor(){
        return service.daftarMentor();
    }

    @PostMapping("/tambahMentor")
    public Mentor tambahMentor(@RequestBody Mentor mentor){
        return service.tambahMentor(mentor);
    }

    @PutMapping("/ubahDataMentor")
    public Mentor ubahDataMentor(@RequestBody Mentor mentor){
        return service.ubahDataMentor(mentor);
    }

    @DeleteMapping("/hapusMentor/{id}")
    public String hapusMentor(@PathVariable int id){
        return service.hapusMentor(id);
    }
}
