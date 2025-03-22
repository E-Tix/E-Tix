package com.example.demo.Repository;

import com.example.demo.Entity.Bilet;
import com.example.demo.Entity.KullaniciBilet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KullaniciBiletRepository extends JpaRepository<KullaniciBilet, Long> {

    @Query("""
    SELECT kb.bilet FROM KullaniciBilet kb
    WHERE kb.kullanici.kullaniciID = :kullaniciId
""")
    List<Bilet> findBiletlerByKullanici(@Param("kullaniciId") Long kullaniciId);

    @Query("""
    SELECT kb.bilet, ess.etkinlik, ess.salon, ess.seans 
    FROM KullaniciBilet kb
    JOIN EtkinlikSalonSeans ess
    WHERE kb.kullanici.kullaniciID = :kullaniciId
""")
    List<Object[]> findBiletlerWithEtkinlikSalonSeansByKullanici(@Param("kullaniciId") Long kullaniciId);

}
