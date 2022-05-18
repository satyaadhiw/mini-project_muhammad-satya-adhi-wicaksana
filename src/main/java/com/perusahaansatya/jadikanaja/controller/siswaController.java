package com.perusahaansatya.jadikanaja.controller;

import com.perusahaansatya.jadikanaja.service.siswaService;
import com.perusahaansatya.jadikanaja.entity.Siswa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class siswaController {

    @Autowired
    private siswaService service;

    @GetMapping("/daftarSiswa")
    public List<Siswa> daftarSiswa() { return service.daftarSiswa();
    }

    @PostMapping("/tambahSiswa")
    public Siswa tambahSiswa(@RequestBody Siswa siswa) { return service.tambahSiswa(siswa);
    }

    @PutMapping("/ubahDataSiswa")
    public Siswa ubahDataSiswa(@RequestBody Siswa siswa) {
        return service.ubahDataSiswa(siswa);
    }

    @DeleteMapping("/hapusSiswa/{id}")
    public String deleteUser(@PathVariable int id) {
        return service.hapusSiswa(id);
    }



}
