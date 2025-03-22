package com.example.demo.Repository;

import com.example.demo.Entity.Bilet;
import com.example.demo.Entity.Seans;
import com.example.demo.Entity.SeansKoltukBilet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeansKoltukBiletRepository extends JpaRepository<SeansKoltukBilet, Long> {

    @Query("""
        SELECT skb.bilet FROM SeansKoltukBilet skb
        WHERE skb.seans.seansID = :seansId
    """)
    List<Bilet> findBiletlerBySeans(@Param("seansId") Long seansId);

    @Query("""
        SELECT DISTINCT s FROM Seans s
        JOIN Salon sa
        WHERE sa.salonID = :salonId
    """)
    List<Seans> findSeanslarBySalon(@Param("salonId") Long salonId);

    @Query("""
        SELECT skb.koltuk FROM SeansKoltukBilet skb
        WHERE skb.seans.seansID = :seandsId
    """)
    List<Seans> findKoltukBySeanslar(@Param("seandsId") Long seansId);

    @Query("""
        SELECT skb.koltuk FROM SeansKoltukBilet skb
        WHERE skb.seans.seansID = :seandsId
    """)
    List<Seans> findKoltuklarStatusBySeanslar(@Param("seandsId") Long seansId);
}
