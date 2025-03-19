package com.example.demo.Entity;


import jakarta.persistence.*;
import org.springframework.web.context.annotation.SessionScope;

import java.sql.Timestamp;

@Entity
@Table(name = "etkinlik")
@SessionScope
public class Etkinlik{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long etkinlikId;

    @ManyToOne
    private Organizator organizator;

    @ManyToOne
    private EtkinlikTur etkinlikTur;

    @ManyToOne
    private Sehir sehir;

    @ManyToOne
    private EtkinlikSalonSeans

    private String etkinlikAdi;
    private String kapakFotografi;
    private String etkinlikAciklamasi;
    private int yasSiniri;
    private Timestamp etkinlikSuresi;
    private Timestamp olusturulmaTarihi;
    private boolean tarihigectiMi;
    private float biletFiyati;

    public Etkinlik(){
    }

    public Etkinlik(Long etkinlikId, Organizator organizator, EtkinlikTur etkinlikTur, Sehir sehir, String etkinlikAdi, String kapakFotografi, String etkinlikAciklamasi, int yasSiniri, Timestamp etkinlikSuresi, Timestamp olusturulmaTarihi, boolean tarihigectiMi, float biletFiyati) {
        this.etkinlikId = etkinlikId;
        this.organizator = organizator;
        this.etkinlikTur = etkinlikTur;
        this.sehir = sehir;
        this.etkinlikAdi = etkinlikAdi;
        this.kapakFotografi = kapakFotografi;
        this.etkinlikAciklamasi = etkinlikAciklamasi;
        this.yasSiniri = yasSiniri;
        this.etkinlikSuresi = etkinlikSuresi;
        this.olusturulmaTarihi = olusturulmaTarihi;
        this.tarihigectiMi = tarihigectiMi;
        this.biletFiyati = biletFiyati;
    }

    public Long getEtkinlikId() {
        return etkinlikId;
    }

    public void setEtkinlikId(Long etkinlikId) {
        this.etkinlikId = etkinlikId;
    }

    public Organizator getOrganizator() {
        return organizator;
    }

    public void setOrganizator(Organizator organizator) {
        this.organizator = organizator;
    }

    public EtkinlikTur getEtkinlikTur() {
        return etkinlikTur;
    }

    public void setEtkinlikTur(EtkinlikTur etkinlikTur) {
        this.etkinlikTur = etkinlikTur;
    }

    public Sehir getSehir() {
        return sehir;
    }

    public void setSehir(Sehir sehir) {
        this.sehir = sehir;
    }

    public String getEtkinlikAdi() {
        return etkinlikAdi;
    }

    public void setEtkinlikAdi(String etkinlikAdi) {
        this.etkinlikAdi = etkinlikAdi;
    }

    public String getKapakFotografi() {
        return kapakFotografi;
    }

    public void setKapakFotografi(String kapakFotografi) {
        this.kapakFotografi = kapakFotografi;
    }

    public String getEtkinlikAciklamasi() {
        return etkinlikAciklamasi;
    }

    public void setEtkinlikAciklamasi(String etkinlikAciklamasi) {
        this.etkinlikAciklamasi = etkinlikAciklamasi;
    }

    public int getYasSiniri() {
        return yasSiniri;
    }

    public void setYasSiniri(int yasSiniri) {
        this.yasSiniri = yasSiniri;
    }

    public Timestamp getEtkinlikSuresi() {
        return etkinlikSuresi;
    }

    public void setEtkinlikSuresi(Timestamp etkinlikSuresi) {
        this.etkinlikSuresi = etkinlikSuresi;
    }

    public Timestamp getOlusturulmaTarihi() {
        return olusturulmaTarihi;
    }

    public void setOlusturulmaTarihi(Timestamp olusturulmaTarihi) {
        this.olusturulmaTarihi = olusturulmaTarihi;
    }

    public boolean isTarihigectiMi() {
        return tarihigectiMi;
    }

    public void setTarihigectiMi(boolean tarihigectiMi) {
        this.tarihigectiMi = tarihigectiMi;
    }

    public float getBiletFiyati() {
        return biletFiyati;
    }

    public void setBiletFiyati(float biletFiyati) {
        this.biletFiyati = biletFiyati;
    }
}
