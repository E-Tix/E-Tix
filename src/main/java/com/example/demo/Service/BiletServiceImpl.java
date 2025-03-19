package com.example.demo.Service;

import com.example.demo.Entity.Bilet;
import com.example.demo.Repository.BiletRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BiletServiceImpl implements BiletService {
    private final BiletRepository biletRepository;

    public BiletServiceImpl(BiletRepository biletRepository) {
        this.biletRepository = biletRepository;
    }

    @Override
    public Optional<Bilet> getBiletById(Long id) {
        return biletRepository.findById(id);
    }

    @Override
    public Bilet saveBilet(Bilet bilet) {
        return biletRepository.save(bilet);
    }

    @Override
    public List<Bilet> getAllBiletler() {
        return biletRepository.findAll();
    }

    @Override
    public void deleteBilet(Long id) {
        biletRepository.deleteById(id);
    }
}