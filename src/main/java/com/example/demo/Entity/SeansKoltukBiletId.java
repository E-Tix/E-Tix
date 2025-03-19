package com.example.demo.Entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class SeansKoltukBiletId implements Serializable {

    private Long seansId;
    private Long koltukId;
    private Long biletId;

    public SeansKoltukBiletId(){
    }

    public SeansKoltukBiletId(Long seansId, Long koltukId, Long biletId) {
        this.seansId = seansId;
        this.koltukId = koltukId;
        this.biletId = biletId;
    }

    @Override
    public boolean equals (Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        SeansKoltukBiletId skb = (SeansKoltukBiletId) o;
        return  Objects.equals(seansId, skb.seansId) &&
                Objects.equals(koltukId, skb.koltukId) &&
                Objects.equals(biletId, skb.biletId);
    }

    @Override
    public int hashCode(){
        return Objects.hash(seansId, koltukId, biletId);
    }
}
