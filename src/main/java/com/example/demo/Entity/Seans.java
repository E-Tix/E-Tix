package com.example.demo.Entity;

import jakarta.persistence.*;
import org.springframework.web.context.annotation.SessionScope;

import java.sql.Timestamp;

@Entity
@Table(name="Seans")
@SessionScope
public class Seans{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seansID;
    private Timestamp tarih;
    private Timestamp bitisTarih;
    private boolean   tarihiGectiMi;
    private Timestamp olusturulmaTarihi;

    //Constructor
    public Seans(){

    }

    public Seans(Long seansID, Timestamp tarih, Timestamp bitisTarih, boolean tarihiGectiMi, Timestamp olusturulmaTarihi) {
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
