package com.example.demo.Repository;

import com.example.demo.Entity.Organizator;
import org.aspectj.weaver.ast.Or;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrganizatorRepository extends JpaRepository<Organizator,Long> {

    Optional<Organizator> findByOrganizatorID(Long organizatorID); 
    Optional<Organizator> findByAdSoyad(String adSoyad);
    Optional<Organizator> findByEmail(String email);
    Optional<Organizator> findBySifre(String sifre);

}
