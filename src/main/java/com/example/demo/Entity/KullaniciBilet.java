package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "kullanici_bilet")
public class KullaniciBilet {

    @EmbeddedId
    private KullaniciBiletId id;

    @ManyToOne
    @MapsId("kullaniciId")
    @JoinColumn(name = "kullanici_id")
    private Kullanici kullanici;

    @ManyToOne
    @MapsId("biletId")
    @JoinColumn(name = "bilet_id")
    private Bilet bilet;

    private String durum;

    public KullaniciBilet() {}

    public KullaniciBilet(Kullanici kullanici, Bilet bilet, String durum) {
        this.id = new KullaniciBiletId(kullanici.getKullaniciID(), bilet.getId());
        this.kullanici = kullanici;
        this.bilet = bilet;
        this.durum = durum;
    }

}
