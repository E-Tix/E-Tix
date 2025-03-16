package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import org.springframework.web.context.annotation.SessionScope;


@Entity
@Table(name = "GeciciKullanicilar")
@SessionScope
public class GeciciKullanici{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long geciciKullaniciID;
    private String adSoyad;

    public GeciciKullanici() {}
    public GeciciKullanici(Long geciciKullaniciID,String adsoyad){
        this.geciciKullaniciID =geciciKullaniciID;
        this.adSoyad=adsoyad;
    }


    public Long getGeciciKullaniciID() {
        return geciciKullaniciID;
    }

    public void setGeciciKullaniciID(Long geciciKullaniciID) {
        this.geciciKullaniciID = geciciKullaniciID;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

}