package com.example.demo.Entity;

import jakarta.persistence.*;
import org.hibernate.metamodel.model.domain.internal.SetAttributeImpl;
import org.springframework.web.context.annotation.SessionScope;

import java.io.Serializable;

@Entity
@SessionScope
@Table (name="Koltuk")
public class Koltuk{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long koltukId;

    @OneToOne(mappedBy = "koltuk")
    private SeansBiletKoltuk seansBiletKoltuklar;

    @ManyToOne
    private Salon salon;

    private int satir;
    private int sutun;

    public Koltuk(){}

    public Koltuk(Long koltukId, Bilet bilet, Salon salon, int satir, int sutun) {
        this.koltukId = koltukId;
        this.bilet = bilet;
        this.salon = salon;
        this.satir = satir;
        this.sutun = sutun;
    }

    public Long getKoltukId() {
        return koltukId;
    }

    public void setKoltukId(Long koltukId) {
        this.koltukId = koltukId;
    }

    public Salon getSalon() {
        return salon;
    }

    public void setSalon(Salon salon) {
        this.salon = salon;
    }

    public int getSatir() {
        return satir;
    }

    public void setSatir(int satir) {
        this.satir = satir;
    }

    public int getSutun() {
        return sutun;
    }

    public void setSutun(int sutun) {
        this.sutun = sutun;
    }
}
