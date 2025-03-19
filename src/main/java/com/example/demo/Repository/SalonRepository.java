package com.example.demo.Repository;


import com.example.demo.Entity.Salon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SalonRepository extends JpaRepository<Salon,Long> {

    Optional<Salon> findBySalonID(Long salonID);

}
