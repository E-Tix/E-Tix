package com.example.demo.Service;

import com.example.demo.Entity.KullaniciEntity;
import com.example.demo.Repository.KullaniciRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KullaniciService {
    @Autowired
    KullaniciRepository kullaniciRepository;

    public boolean kullaniciEkle(KullaniciEntity kullanici)
    {
        kullaniciRepository.save(kullanici);
        return true;
    }
}
