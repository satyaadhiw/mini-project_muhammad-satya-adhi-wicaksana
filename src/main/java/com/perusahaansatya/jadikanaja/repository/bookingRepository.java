package com.perusahaansatya.jadikanaja.repository;

import com.perusahaansatya.jadikanaja.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface bookingRepository extends JpaRepository<Booking, Integer> {

}
