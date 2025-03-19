package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Sehir")
public class SehirEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "plakaKodu")
    private Long plakaKodu;

    @Column(name = "sehirAdi")
    private String sehirAdi;

    public SehirEntity(Long plakaKodu, String sehirAdi) {
        this.plakaKodu = plakaKodu;
        this.sehirAdi = sehirAdi;
    }

    public SehirEntity(){

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
