package com.example.demo.Entity;

import jakarta.persistence.*;
import org.springframework.web.context.annotation.SessionScope;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Set;

@Entity
@Table(name = "bilet")
@SessionScope
public class Bilet{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long biletID;
    private Boolean odendiMi;
    private Float odenenMiktar;
    private Timestamp olusturmaZamani;
    @OneToMany(mappedBy = "bilet")
    private ArrayList<KullaniciBilet> kullanicilar;

    public Bilet(){}

    public Bilet(Long biletID, Boolean odendiMi, Float odenenMiktar, Timestamp olusturmaZamani, ArrayList<KullaniciBilet> kullanicilar) {
        this.biletID = biletID;
        this.odendiMi = odendiMi;
        this.odenenMiktar = odenenMiktar;
        this.olusturmaZamani = olusturmaZamani;
        this.kullanicilar = kullanicilar;
    }

    public Long getBiletID() {
        return biletID;
    }

    public void setBiletID(Long biletID) {
        this.biletID = biletID;
    }

    public Boolean getOdendiMi() {
        return odendiMi;
    }

    public void setOdendiMi(Boolean odendiMi) {
        this.odendiMi = odendiMi;
    }

    public Float getOdenenMiktar() {
        return odenenMiktar;
    }

    public void setOdenenMiktar(Float odenenMiktar) {
        this.odenenMiktar = odenenMiktar;
    }

    public Timestamp getOlusturmaZamani() {
        return olusturmaZamani;
    }

    public void setOlusturmaZamani(Timestamp olusturmaZamani) {
        this.olusturmaZamani = olusturmaZamani;
    }

    public ArrayList<KullaniciBilet> getKullanicilar() {
        return kullanicilar;
    }

    public void setKullanicilar(ArrayList<KullaniciBilet> kullanicilar) {
        this.kullanicilar = kullanicilar;
    }
}