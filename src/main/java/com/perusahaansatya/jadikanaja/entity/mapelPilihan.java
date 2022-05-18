package com.perusahaansatya.jadikanaja.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mapel_pilihan")
public class mapelPilihan {

    @Id
    private int id;
    private String kodeMapelPilihan;
    private String deskripsiMapel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKodeMapelPilihan() {
        return kodeMapelPilihan;
    }

    public void setKodeMapelPilihan(String kodeMapelPilihan) {
        this.kodeMapelPilihan = kodeMapelPilihan;
    }

    public String getDeskripsiMapel() {
        return deskripsiMapel;
    }

    public void setDeskripsiMapel(String deskripsiMapel) {
        this.deskripsiMapel = deskripsiMapel;
    }

    @Override
    public String toString() {
        return "mapelPilihan{" +
                "id=" + id +
                ", kodeMapelPilihan='" + kodeMapelPilihan + '\'' +
                ", deskripsiMapel='" + deskripsiMapel + '\'' +
                '}';
    }
}
