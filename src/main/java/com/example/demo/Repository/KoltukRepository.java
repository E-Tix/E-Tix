package com.example.demo.Repository;

import com.example.demo.Entity.Koltuk;
import com.example.demo.Entity.Salon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface KoltukRepository extends JpaRepository<Koltuk, Long> {

    Optional<Koltuk> findByKoltukID(Long koltukID);
   //Optional<Koltuk> findBySalon_SalonID(Long salonID);

    List<Koltuk>findBySalon_SalonID(Long salonID);

    //Belli bir salondaki bütün koltukları bulmak için
    Optional<List<Koltuk>> findBySalon(Salon salon);
}
