package com.example.demo.Repository;

import com.example.demo.Entity.Seans;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

public interface SeansRepository extends JpaRepository<Seans, Long> {

    Optional<Seans> findBySeansID(Long seansID);
    Optional<Seans> findByTarih(Timestamp tarih);
    Optional<Seans> findByBitisTarihi(Timestamp bitistarihi);
    Optional<Seans> findByTarihiGectiMi(Boolean tarihiGectiMi);

    //Belirli bir tarihten sonra oluşturulmuş seanslar
    List<Seans> findByOlusturmaZamanıAfter(Timestamp zaman);

    //Belirli bir tarihten önce oluşturulmuş seanslar
    List<Seans> findByOlusturmaZamanıBefore(Timestamp zaman);

    //Belli tarihler arası
    List<Seans> findByOlusturmaZamanıBetween(Timestamp baslangıc, Timestamp bitis);

}
