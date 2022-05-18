package com.perusahaansatya.jadikanaja.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "booking")
public class Booking {

    @Id
    private int id;
    private int userSiswaId;
    private int kodeBooking;
    private int statusBookingId;
    private int detailBookingId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserSiswaId() {
        return userSiswaId;
    }

    public void setUserSiswaId(int userSiswaId) {
        this.userSiswaId = userSiswaId;
    }

    public int getKodeBooking() {
        return kodeBooking;
    }

    public void setKodeBooking(int kodeBooking) {
        this.kodeBooking = kodeBooking;
    }

    public int getStatusBookingId() {
        return statusBookingId;
    }

    public void setStatusBookingId(int statusBookingId) {
        this.statusBookingId = statusBookingId;
    }

    public int getDetailBookingId() {
        return detailBookingId;
    }

    public void setDetailBookingId(int detailBookingId) {
        this.detailBookingId = detailBookingId;
    }

    @Override
    public String toString() {
        return "booking{" +
                "id=" + id +
                ", userSiswaId=" + userSiswaId +
                ", kodeBooking=" + kodeBooking +
                ", statusBookingId=" + statusBookingId +
                ", detailBookingId=" + detailBookingId +
                '}';
    }
}
