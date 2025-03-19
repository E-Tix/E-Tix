package com.example.demo.Service;

import com.example.demo.Entity.Etkinlik;
import com.example.demo.Repository.EtkinlikRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EtkinlikService {
    private final EtkinlikRepo etkinlikRepo;

    public EtkinlikService(EtkinlikRepo etkinlikRepo){
        this.etkinlikRepo=etkinlikRepo;
    }


    // Yeni etkinlik kaydet veya güncelle
    public Etkinlik saveEtkinlik(Etkinlik etkinlik) {
        return etkinlikRepo.save(etkinlik);
    }

    // Tüm etkinlikleri getir
    public List<Etkinlik> getAllEtkinlikler() {
        return etkinlikRepo.findAll();
    }

    // Etkinliği ID'ye göre sil
    public void deleteEtkinlik(Long id) {
        etkinlikRepo.deleteById(id);
    }


}
