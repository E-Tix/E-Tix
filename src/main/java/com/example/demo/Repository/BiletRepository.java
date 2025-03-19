package com.example.demo.Repository;


import com.example.demo.Entity.Bilet;
import com.example.demo.Entity.KullaniciBilet;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface BiletRepository extends JpaRepository<Bilet, Long> {

    
    Optional<Bilet> findByOdendiMi(Boolean odendiMi);

    Optional<Bilet> findByBiletID(Long biletID);

    //Belirli bir tarihten sonra oluşturulmuş biletler
    List<Bilet> findByOlusturmaZamanıAfter(Timestamp zaman);

    //Belirli bir tarihten önce oluşturulmuş biletler
    List<Bilet> findByOlusturmaZamanıBefore(Timestamp zaman);

    //Belli tarihler arası
    List<Bilet> findByOlusturmaZamanıBetween(Timestamp baslangıc, Timestamp bitis);
}
