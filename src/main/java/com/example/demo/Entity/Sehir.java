package com.example.demo.Entity;

import jakarta.persistence.*;
import org.springframework.web.context.annotation.SessionScope;

import java.io.Serializable;

@Entity
@Table(name = "sehir")
@SessionScope
public class Sehir{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long plakaKodu;
    private String sehirAdi;


    public Sehir(){}

    public Sehir(Long plakaKodu, String sehirAdi) {
        this.plakaKodu = plakaKodu;
        this.sehirAdi = sehirAdi;
    }

    public Long getPlakaKodu() {
        return plakaKodu;
    }

    public void setPlakaKodu(Long plakaKodu) {
        this.plakaKodu = plakaKodu;
    }

    public String getSehirAdi() {
        return sehirAdi;
    }

    public void setSehirAdi(String sehirAdi) {
        this.sehirAdi = sehirAdi;
    }
}