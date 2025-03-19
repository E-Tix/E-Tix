package com.example.demo.Entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "seanskoltukbilet")
public class SeansKoltukBilet {

    @EmbeddedId
    private SeansKoltukBiletId seansKoltukBiletId;

    @ManyToOne
    @MapsId("seansId")
    @JoinColumn(name = "seans_id", nullable = false)
    private Seans seans;

    @OneToOne
    @MapsId("koltukId")
    @JoinColumn(name = "koltuk_id", nullable = false)
    private Koltuk koltuk;

    @OneToOne
    @MapsId("biletId")
    @JoinColumn(name = "bilet_id", unique = true, nullable = false)
    private Bilet bilet;

    public SeansKoltukBilet() {}

    public SeansKoltukBilet(Seans seans, Koltuk koltuk, Bilet bilet) {
        this.seansKoltukBiletId = new SeansKoltukBiletId(seans.getSeansId(), koltuk.getKoltukId(), bilet.getBiletId());
        this.seans = seans;
        this.koltuk = koltuk;
        this.bilet = bilet;
    }

    public SeansKoltukBiletId getSeansKoltukBiletId() { return seansKoltukBiletId; }
    public void setSeansKoltukBiletId(SeansKoltukBiletId seansKoltukBiletId) { this.seansKoltukBiletId = seansKoltukBiletId; }

    public Seans getSeans() { return seans; }
    public void setSeans(Seans seans) { this.seans = seans; }

    public Koltuk getKoltuk() { return koltuk; }
    public void setKoltuk(Koltuk koltuk) { this.koltuk = koltuk; }

    public Bilet getBilet() { return bilet; }
    public void setBilet(Bilet bilet) { this.bilet = bilet; }
}
