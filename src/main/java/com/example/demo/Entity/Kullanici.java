package com.example.demo.Entity;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;

@Entity
@Table(name = "Kullanici")
@SessionScope
public class Kullanici{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long kullaniciID;
    @ManyToOne
    private Sehir sehir;
    @OneToMany(mappedBy = "kullanici")
    private ArrayList<KullaniciBilet> biletler;
    private String kullaniciAdi;
    private String adSoyad;
    private String sifre;
    private String email;
    private String telNo;

    public Kullanici() {}

    public Kullanici(Long kullaniciID, Sehir sehir, ArrayList<KullaniciBilet> biletler, String kullaniciAdi, String adSoyad, String sifre, String email, String telNo) {
        this.kullaniciID = kullaniciID;
        this.sehir = sehir;
        this.biletler = biletler;
        this.kullaniciAdi = kullaniciAdi;
        this.adSoyad = adSoyad;
        this.sifre = sifre;
        this.email = email;
        this.telNo = telNo;
    }

    public Long getKullaniciID() {
        return kullaniciID;
    }

    public void setKullaniciID(Long kullaniciID) {
        this.kullaniciID = kullaniciID;
    }

    public Sehir getSehir() {
        return sehir;
    }

    public void setSehir(Sehir sehir) {
        this.sehir = sehir;
    }

    public ArrayList<KullaniciBilet> getBiletler() {
        return biletler;
    }

    public void setBiletler(ArrayList<KullaniciBilet> biletler) {
        this.biletler = biletler;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }
}
