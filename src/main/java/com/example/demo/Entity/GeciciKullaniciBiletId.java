package com.example.demo.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class GeciciKullaniciBiletId implements Serializable {


    private Long geciciKullaniciId;
    private Long biletId;

    //Constructor
    public GeciciKullaniciBiletId(){

    }
    public GeciciKullaniciBiletId(Long geciciKullaniciId,Long biletId){
        this.geciciKullaniciId=geciciKullaniciId;
        this.biletId=biletId;

    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        GeciciKullaniciBiletId gkb =(GeciciKullaniciBiletId) o;
        return Objects.equals(geciciKullaniciId, gkb.geciciKullaniciId) &&
                Objects.equals(biletId, gkb.biletId);
    }
    @Override
    public int hashCode(){
        return Objects.hash(geciciKullaniciId,biletId);
    }


}
