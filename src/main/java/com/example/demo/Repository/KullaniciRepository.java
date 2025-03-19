package com.example.demo.Repository;

import com.example.demo.Entity.Kullanici;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface KullaniciRepository {
    Optional<Kullanici>findByKullaniciId(Long kullaniciID);
    Optional<Kullanici>findByPlakaKodu(int plakaKodu);
    Optional<Kullanici>findByKullaniciAdi(String kullaniciAdi);
    Optional<Kullanici>findBySifre(String sifre);
    Optional<Kullanici>findByEmail(String email);


}
