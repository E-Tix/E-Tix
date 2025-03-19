package com.example.demo.Repository;


import com.example.demo.Entity.Salon;
import com.example.demo.Entity.Sehir;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SehirRepository extends JpaRepository<Salon,Long> {

    Optional<Sehir>findByPlakaKodu(Long plakaKodu);

}
