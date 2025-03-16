package com.example.demo.Entity;

import jakarta.persistence.*;


@Entity
@Table(name = "seanskoltukbilet")
public class SeansKoltukBiletdeneme {

    @EmbeddedId
    SeansKoltukBiletId seansKoltukBiletId;
    private Seans seans;
    private Koltuk koltuk;
    @OneToMany
    @Column(unique = true)
    private  Bilet bilet;



}
