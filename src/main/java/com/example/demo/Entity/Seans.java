package com.example.demo.Entity;

import jakarta.persistence.*;
import org.springframework.web.context.annotation.SessionScope;

import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;

@Entity
@Table(name="Seans")
@SessionScope
public class Seans{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seansId;

    @OneToMany(mappedBy = "seans")
    private List<SeansBiletKoltuk> seansBiletKoltukList;

    @OneToOne(mappedBy = "seans")
    private List<EtkinlikSalonSeans> etkinlikSalonSeansList;

    private Timestamp tarih;
    private Timestamp bitisTarih;
    private boolean tarihiGectiMi;
    private Timestamp olusturulmaTarihi;

    public Seans(){}

    public Seans(Long seansId, Timestamp tarih, Timestamp bitisTarih, boolean tarihiGectiMi, Timestamp olusturulmaTarihi) {
        this.seansId = seansId;
        this.tarih = tarih;
        this.bitisTarih = bitisTarih;
        this.tarihiGectiMi = tarihiGectiMi;
        this.olusturulmaTarihi = olusturulmaTarihi;
    }

    public Long getSeansId() {
        return seansId;
    }

    public void setSeansId(Long seansId) {
        this.seansId = seansId;
    }

    public Timestamp getTarih() {
        return tarih;
    }

    public void setTarih(Timestamp tarih) {
        this.tarih = tarih;
    }

    public Timestamp getBitisTarih() {
        return bitisTarih;
    }

    public void setBitisTarih(Timestamp bitisTarih) {
        this.bitisTarih = bitisTarih;
    }

    public boolean isTarihiGectiMi() {
        return tarihiGectiMi;
    }

    public void setTarihiGectiMi(boolean tarihiGectiMi) {
        this.tarihiGectiMi = tarihiGectiMi;
    }

    public Timestamp getOlusturulmaTarihi() {
        return olusturulmaTarihi;
    }

    public void setOlusturulmaTarihi(Timestamp olusturulmaTarihi) {
        this.olusturulmaTarihi = olusturulmaTarihi;
    }
}
