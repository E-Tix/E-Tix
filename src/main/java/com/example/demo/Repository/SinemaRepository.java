package com.example.demo.Repository;

import com.example.demo.Entity.Sinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SinemaRepository extends JpaRepository<Sinema,Long> {

    Optional<Sinema>findByEtkinlikId(Long etkinlikId);
    Optional<Sinema>findByIMDBPuani(float IMDBPuani);

}
