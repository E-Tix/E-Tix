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
    @GeneratedValue(strategy = GenerationType.IdENTITY)
    private Long biletId;

    @OneToOne(mappedBy = "bilet")
    private SeansBiletKoltuk seansBiletKoltuklar;

    @OneToMany(mappedBy = "bilet")
    private ArrayList<KullaniciBilet> kullanicilar;

    private Boolean odendiMi;
    private Float odenenMiktar;
    private Timestamp olusturmaZamani;


    public Bilet(){}

    public Bilet(Long biletId, ArrayList<KullaniciBilet> kullanicilar, Koltuk koltuk, Boolean odendiMi, Float odenenMiktar, Timestamp olusturmaZamani) {
        this.biletId = biletId;
        this.kullanicilar = kullanicilar;
        this.koltuk = koltuk;
        this.odendiMi = odendiMi;
        this.odenenMiktar = odenenMiktar;
        this.olusturmaZamani = olusturmaZamani;
    }

    public Long getBiletId() {
        return biletId;
    }

    public void setBiletId(Long biletId) {
        this.biletId = biletId;
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