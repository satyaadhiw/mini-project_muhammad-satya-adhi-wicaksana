package com.perusahaansatya.jadikanaja.service;

import com.perusahaansatya.jadikanaja.entity.Mentor;
import com.perusahaansatya.jadikanaja.entity.Siswa;
import com.perusahaansatya.jadikanaja.repository.mentorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class mentorService {

    @Autowired
    private mentorRepository repository;

    public List<Mentor> daftarMentor(){
        return repository.findAll();
    }

    public Mentor cariMentor(int id) {
        return repository.findById(id).orElse(null);
    }

    public Mentor tambahMentor(Mentor mentor){
        return repository.save(mentor);
    }

    public String hapusMentor(int id){
        repository.deleteById(id);
        return "Data Mentor Berhasil Dihapus";
    }

    public Mentor ubahDataMentor(Mentor mentor) {
        Mentor ubahDataMentor = repository.findById(mentor.getId()).orElse(null);
        ubahDataMentor.setNama(mentor.getNama());
        ubahDataMentor.setJenisKelamin(mentor.getJenisKelamin());
        ubahDataMentor.setNoHp(mentor.getNoHp());
        ubahDataMentor.setEmail(mentor.getEmail());
        return repository.save(ubahDataMentor);
    }

}
