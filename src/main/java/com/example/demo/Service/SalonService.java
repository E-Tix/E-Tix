package com.example.demo.Service;

import com.example.demo.Entity.Salon;
import com.example.demo.Repository.SalonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalonService {
    private final SalonRepository salonRepository;

    public SalonService(SalonRepository salonRepository){
        this.salonRepository=salonRepository;
    }

    public Salon saveSalon(Salon salon){
        return salonRepository.save(salon);
    }

    public List<Salon>salonList(){
        return salonRepository.findAll();
    }

    public void deleteSalon(Long id){
        salonRepository.deleteById(id);
    }
}
