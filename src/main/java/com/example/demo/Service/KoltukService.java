package com.example.demo.Service;

import com.example.demo.Entity.Salon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Entity.Koltuk;
import com.example.demo.Repository.KoltukRepository;
import com.example.demo.Repository.SalonRepository;
import java.util.List;
import java.util.Optional;

@Service
public class KoltukService {

    @Autowired
    private KoltukRepository koltukRepository;
    @Autowired
    private SalonRepository salonRepository;


    public KoltukService(KoltukRepository koltukRepository,SalonRepository salonRepository){
        this.koltukRepository=koltukRepository;
        this.salonRepository=salonRepository;
    }

    public Koltuk saveKoltuk(Koltuk koltuk) {return koltukRepository.save(koltuk);}
    public List<Koltuk> getAllKoltuklar() {return koltukRepository.findAll();}
    public Optional<Koltuk> koltukGetirIdIle(Long id) {return koltukRepository.findById(id);}
    public void deleteKoltuk(Long id) {koltukRepository.deleteById(id);}
    //EMİN DEĞİLİZ!
    public Optional<List<Koltuk>> getSalonById(Salon salon) {return koltukRepository.findBySalon(salon);}



}
