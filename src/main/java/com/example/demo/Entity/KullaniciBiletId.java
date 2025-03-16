package com.example.demo.Entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class KullaniciBiletId implements Serializable {


    private Long kullaniciId;
    private Long biletId;

    public KullaniciBiletId(){}

    public KullaniciBiletId(Long kullaniciId, Long biletId){
        this.kullaniciId = kullaniciId;
        this.biletId = biletId;
    }



    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        KullaniciBiletId kb =(KullaniciBiletId) o;
        return Objects.equals(kullaniciId, kb.kullaniciId) &&
                Objects.equals(biletId, kb.biletId);
    }

    @Override
    public int hashCode(){
        return Objects.hash(kullaniciId, biletId);
    }
}
