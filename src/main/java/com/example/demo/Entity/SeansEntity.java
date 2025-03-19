package com.example.demo.Entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.web.context.annotation.SessionScope;

import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name="Seans")
@SessionScope
public class SeansEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seansID;

    //@OneToOne(mappedBy = "")
    @OneToMany(mappedBy = "seans")
    private List<EtkinlikSalonSeansEntity> etkinlikSalonSeansEntityList;


    @Column(name = "tarih")
    private Timestamp tarih;

    @Column(name = "bitisTarihi")
    private Timestamp bitisTarih;

    @Column(name = "tarihiGectiMi")
    private boolean   tarihiGectiMi;

    @Column(name = "olusturulmaTarihi")
    @CreationTimestamp
    private Timestamp olusturulmaTarihi;

    public SeansEntity(){

    }

    public SeansEntity(Long seansID, Timestamp tarih, Timestamp bitisTarih, boolean tarihiGectiMi, Timestamp olusturulmaTarihi) {
        this.seansID = seansID;
        this.tarih = tarih;
        this.bitisTarih = bitisTarih;
        this.tarihiGectiMi = tarihiGectiMi;
        this.olusturulmaTarihi = olusturulmaTarihi;
    }

    public Long getSeansID() {
        return seansID;
    }

    public void setSeansID(Long seansID) {
        this.seansID = seansID;
    }

    public Timestamp getTarih() {
        return tarih;
    }

    public void setTarih(Timestamp tarih) {
        this.tarih = tarih;
    }

    public Timestamp getBitisTarih() {
        return bitisTarih;
    }

    public void setBitisTarih(Timestamp bitisTarih) {
        this.bitisTarih = bitisTarih;
    }

    public boolean isTarihiGectiMi() {
        return tarihiGectiMi;
    }

    public void setTarihiGectiMi(boolean tarihiGectiMi) {
        this.tarihiGectiMi = tarihiGectiMi;
    }

    public Timestamp getOlusturulmaTarihi() {
        return olusturulmaTarihi;
    }

    public void setOlusturulmaTarihi(Timestamp olusturulmaTarihi) {
        this.olusturulmaTarihi = olusturulmaTarihi;
    }
}