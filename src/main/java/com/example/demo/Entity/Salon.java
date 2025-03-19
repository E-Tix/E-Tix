package com.example.demo.Entity;

import jakarta.persistence.*;
import org.springframework.web.context.annotation.SessionScope;

import java.io.Serializable;

@Entity
@Table(name = "salon")
@SessionScope
public class Salon{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long salonID;
    private String salonAdi;
    private String adres;

    public Salon(){}

    public Salon(Long salonId, String salonAdi, String adres) {
        this.salonId = salonId;
        this.salonAdi = salonAdi;
        this.adres = adres;
    }

    public Long getSalonId() {
        return salonId;
    }

    public void setSalonId(Long salonId) {
        this.salonId = salonId;
    }

    public String getSalonAdi() {
        return salonAdi;
    }

    public void setSalonAdi(String salonAdi) {
        this.salonAdi = salonAdi;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
}