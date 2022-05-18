package com.perusahaansatya.jadikanaja.repository;

import com.perusahaansatya.jadikanaja.entity.Siswa;
import org.springframework.data.jpa.repository.JpaRepository;

//import java.util.List;

public interface siswaRepository extends JpaRepository<Siswa, Integer>{
//    List<Siswa> cariNamaSiswa = findAllByName(String nama, String nama);
}
