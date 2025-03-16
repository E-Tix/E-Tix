package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
public class GeciciKullaniciBilet {

    @EmbeddedId
    private GeciciKullaniciBiletId id;

    @ManyToOne
    @MapsId("GeciciKullaniciId")
    @JoinColumn(name = "GeciciKullaniciId")
    private GeciciKullanici geciciKullanici;

    @ManyToOne
    @MapsId("biletId")
    @JoinColumn(name = "bilet_id")
    private Bilet bilet;
    public GeciciKullaniciBilet(){}
    public GeciciKullaniciBilet(Kullanici kullanici, Bilet bilet) {
        this.id = new GeciciKullaniciBiletId(geciciKullanici.getGeciciKullaniciID(), bilet.getId());
        this.geciciKullanici = geciciKullanici;
        this.bilet = bilet;
    }




}
