package com.example.demo.Entity;

import jakarta.persistence.*;
import org.springframework.context.annotation.Primary;
import org.springframework.web.context.annotation.SessionScope;
import org.w3c.dom.Text;

import java.awt.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name ="organizator")
@SessionScope
public class Organizator implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long organizatorID;

    //Etkinlik Listeleme
    @OneToMany(mappedBy = "organizator", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Etkinlik> etkinlik;
    private String adSoyad;
    private String vergiNo;
    private String email;
    private String sifre;
    private String iban;
    private TextField sirketAdresi;
    private String tckNo;
    private String telNo;

    //Constructor
    public Organizator() {

    }

    public Organizator(Long organizatorID, List<Etkinlik> etkinlik, String adSoyad, String vergiNo, String email, String sifre, String iban, TextField sirketAdresi, String tckNo, String telNo) {
        this.organizatorID = organizatorID;
        this.etkinlik = etkinlik;
        this.adSoyad = adSoyad;
        this.vergiNo = vergiNo;
        this.email = email;
        this.sifre = sifre;
        this.iban = iban;
        this.sirketAdresi = sirketAdresi;
        this.tckNo = tckNo;
        this.telNo = telNo;
    }

    public Long getOrganizatorID() {
        return organizatorID;
    }

    public void setOrganizatorID(Long organizatorID) {
        this.organizatorID = organizatorID;
    }

    public List<Etkinlik> getEtkinlik() {
        return etkinlik;
    }

    public void setEtkinlik(List<Etkinlik> etkinlik) {
        this.etkinlik = etkinlik;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getVergiNo() {
        return vergiNo;
    }

    public void setVergiNo(String vergiNo) {
        this.vergiNo = vergiNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public TextField getSirketAdresi() {
        return sirketAdresi;
    }

    public void setSirketAdresi(TextField sirketAdresi) {
        this.sirketAdresi = sirketAdresi;
    }

    public String getTckNo() {
        return tckNo;
    }

    public void setTckNo(String tckNo) {
        this.tckNo = tckNo;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }
}
