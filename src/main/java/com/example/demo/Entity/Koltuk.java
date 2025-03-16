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
    private Long koltukID;
    @ManyToOne
    private Salon salon;
    private int satir;
    private int sutun;

    public Koltuk(){}

    public Koltuk(Long koltukID, Salon salon, int satir, int sutun) {
        this.koltukID = koltukID;
        this.salon = salon;
        this.satir = satir;
        this.sutun = sutun;
    }

    public Long getKoltukID() {
        return koltukID;
    }

    public void setKoltukID(Long koltukID) {
        this.koltukID = koltukID;
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
