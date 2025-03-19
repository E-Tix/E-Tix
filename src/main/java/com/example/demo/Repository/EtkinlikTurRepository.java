package com.example.demo.Repository;

import com.example.demo.Entity.Etkinlik;
import com.example.demo.Entity.EtkinlikTur;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EtkinlikTurRepository {

    Optional<EtkinlikTur> findByEtkinlikTurId(Long etkinlikTurId);



    //Sehir=Plaka kodu
    //+++Organizatör=Id,e-mail,adsoyad,sifre
    //+++Sinema=EtkinlikId,IMDB puanı
    //+++Kullanıcı= Id,Plaka Kodu,kullanıcıAdı,Şifre,e-mail
    //gecicikullanıcı=Id
    //Salon=SalonId
    //Seans=SeansId,bütün özellikler
    //Koltuk=KoltukId,SalonId

}
