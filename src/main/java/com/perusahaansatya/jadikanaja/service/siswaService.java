package com.perusahaansatya.jadikanaja.service;

import com.perusahaansatya.jadikanaja.repository.siswaRepository;
import com.perusahaansatya.jadikanaja.entity.Siswa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class siswaService {
    @Autowired
    private siswaRepository repository;

    public List<Siswa> daftarSiswa() {
        return repository.findAll();
    }
    
    public Siswa cariSiswa(int id) {
        return repository.findById(id).orElse(null);

    }

    public Siswa tambahSiswa(Siswa siswa) {
        return repository.save(siswa);
    }

    public String hapusSiswa(int id) {
        repository.deleteById(id);
        return "Data Siswa Berhasil Dihapus";
    }
    public Siswa ubahDataSiswa(Siswa siswa) {
        Siswa dataBaruSiswa = repository.findById(siswa.getId()).orElse(null);
        dataBaruSiswa.setNama(siswa.getNama());
        dataBaruSiswa.setJenisKelamin(siswa.getJenisKelamin());
        dataBaruSiswa.setNoHp(siswa.getNoHp());
        dataBaruSiswa.setEmail(siswa.getEmail());
        return repository.save(dataBaruSiswa);
    }
}
