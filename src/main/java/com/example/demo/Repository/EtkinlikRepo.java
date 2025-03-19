package com.example.demo.Repository;

import com.example.demo.Entity.Etkinlik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

@Repository
public interface EtkinlikRepo extends JpaRepository<Etkinlik,Long> {

    Optional<Etkinlik> findByEtkinlikId(Long Id);

    Optional<Etkinlik> findByOrganitazorId(Long organizatorId);

    Optional<Etkinlik> findByEtkinlikTur(Long etkinlikTurId);

    Optional<Etkinlik> findByTarihiGectiMi(boolean tarihiGectiMi);

    Optional<Etkinlik> findByYasSiniri(int yas);

    List<Etkinlik> findBySehirId(Long plakaKodu);

    List<Etkinlik> findByOlusturulmaTarihi(Timestamp sure);

    Optional<Etkinlik> findByEtkinlikAdi(String EtkinlikAdi);

    List<Etkinlik> findBySure(Timestamp sure);

    List<Etkinlik> findByBiletFiyati(int biletFiyatı);
}
