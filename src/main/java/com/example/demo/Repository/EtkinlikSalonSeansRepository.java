package com.example.demo.Repository;

import com.example.demo.Entity.Etkinlik;
import com.example.demo.Entity.EtkinlikSalonSeans;
import com.example.demo.Entity.Salon;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EtkinlikSalonSeansRepository extends JpaRepository<EtkinlikSalonSeans, Long> {

    @Query("""
    SELECT DISTINCT ess.salon FROM EtkinlikSalonSeans ess
    WHERE ess.etkinlik.etkinlikId = :etkinlikId
    """)
    List<Salon> findSalonlarByEtkinlik(@Param("etkinlikId") Long etkinlikId);

    @Query("""
    SELECT DISTINCT ess.etkinlik FROM EtkinlikSalonSeans ess
    WHERE ess.salon.salonID = :salonId
    """)
    List<Etkinlik> findEtkinliklerBySalon(@Param("salonId") Long salonId);


    @Query("""
    SELECT es.salon, es.seans FROM EtkinlikSalonSeans es
    WHERE es.etkinlik.etkinlikId = :etkinlikId
""")
    List<Object[]> findSalonlarVeSeanslarByEtkinlik(@Param("etkinlikId") Long etkinlikId);

}
