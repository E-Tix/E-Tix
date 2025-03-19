package com.example.demo.Repository;

import com.example.demo.Entity.GeciciKullanici;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface GeciciKullaniciRepository extends JpaRepository<GeciciKullanici, Long> {

    Optional<GeciciKullanici> findByGeciciKullaniciID(Long geciciKullaniciID);

}
