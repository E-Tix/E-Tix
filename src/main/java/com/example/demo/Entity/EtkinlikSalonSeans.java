package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
public class EtkinlikSalonSeans {

    @EmbeddedId
    private EtkinlikSalonSeansId id; // Composite key burada tanımlanır

    @ManyToOne
    @MapsId("etkinlikId")
    @JoinColumn(name = "etkinlik_id")
    private Etkinlik etkinlik;

    @ManyToOne
    @MapsId("salonId")
    @JoinColumn(name = "salon_id")
    private Salon salon;

    @OneToOne
    @MapsId("seansId")
    @JoinColumn(name = "seans_id", unique = true)
    private Seans seans;

    // Getter ve Setter metodları
    public EtkinlikSalonSeansId getId() {
        return id;
    }

    public void setId(EtkinlikSalonSeansId id) {
        this.id = id;
    }

    public Etkinlik getEtkinlik() {
        return etkinlik;
    }

    public void setEtkinlik(Etkinlik etkinlik) {
        this.etkinlik = etkinlik;
    }

    public Salon getSalon() {
        return salon;
    }

    public void setSalon(Salon salon) {
        this.salon = salon;
    }

    public Seans getSeans() {
        return seans;
    }

    public void setSeans(Seans seans) {
        this.seans = seans;
    }
}
