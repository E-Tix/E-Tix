package com.example.demo.Service;

import com.example.demo.Entity.Bilet;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface BiletService {
    List<Bilet> getAllBiletler();
    Optional<Bilet> getBiletById(Long id);
    Bilet saveBilet(Bilet bilet);
    void deleteBilet(Long id);
}
