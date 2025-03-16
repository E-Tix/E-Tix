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

    public Salon(Long salonID, String salonAdi, String adres) {
        this.salonID = salonID;
        this.salonAdi = salonAdi;
        this.adres = adres;
    }

    public Long getSalonID() {
        return salonID;
    }

    public void setSalonID(Long salonID) {
        this.salonID = salonID;
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