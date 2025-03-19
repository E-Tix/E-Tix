package com.example.demo.Service;

import com.example.demo.Entity.Salon;
import com.example.demo.Entity.Sehir;
import com.example.demo.Repository.SehirRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SehirService {
    private SehirRepository sehirRepository;
    public SehirService(SehirRepository sehirRepository){
        this.sehirRepository=sehirRepository;
    }

}
