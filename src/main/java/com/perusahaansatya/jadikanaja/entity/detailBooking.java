package com.perusahaansatya.jadikanaja.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "detail_booking")
public class detailBooking {

    @Id
    private int id;
    private int userMentorId;
    private int mapelPilihanId;
    private int kodeTanggalPertemuan;
    private Date createdAt;
    private Date updatedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserMentorId() {
        return userMentorId;
    }

    public void setUserMentorId(int userMentorId) {
        this.userMentorId = userMentorId;
    }

    public int getMapelPilihanId() {
        return mapelPilihanId;
    }

    public void setMapelPilihanId(int mapelPilihanId) {
        this.mapelPilihanId = mapelPilihanId;
    }

    public int getKodeTanggalPertemuan() {
        return kodeTanggalPertemuan;
    }

    public void setKodeTanggalPertemuan(int kodeTanggalPertemuan) {
        this.kodeTanggalPertemuan = kodeTanggalPertemuan;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "detailBooking{" +
                "id=" + id +
                ", userMentorId=" + userMentorId +
                ", mapelPilihanId=" + mapelPilihanId +
                ", kodeTanggalPertemuan=" + kodeTanggalPertemuan +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
