package com.example.demo.Entity;

import jakarta.persistence.*;
import org.springframework.web.context.annotation.SessionScope;

@Entity
@SessionScope
@Table(name = "EtkinlikTur")
public class EtkinlikTur {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "etkinlikTurID",unique = true,nullable = false)
    private Long etkinlikTurID;
    @Column(name = "turAdi")
    private String turAdi;

    public EtkinlikTur(Long etkinlikTurID,String turAdi)
    {
        this.etkinlikTurID =etkinlikTurID;
        this.turAdi=turAdi;
    }

    public EtkinlikTur() {
        
    }

    public Long getEtkinlikTurID() {
        return etkinlikTurID;
    }

    public void setEtkinlikTurID(Long etkinlikTurID) {
        this.etkinlikTurID = etkinlikTurID;
    }

    public String getTurAdi() {
        return turAdi;
    }

    public void setTurAdi(String turAdi) {
        this.turAdi = turAdi;
    }
}