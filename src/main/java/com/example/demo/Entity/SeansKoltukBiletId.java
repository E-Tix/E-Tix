package com.example.demo.Entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class SeansKoltukBiletId implements Serializable {

    private Long koltukID;
    private Long seansID;
    private Long biletID;

    public SeansKoltukBiletId(){
    }

    public SeansKoltukBiletId(Long koltukID, Long seansID, Long biletID){
        this.koltukID = koltukID;
        this.seansID = seansID;
        this.biletID = biletID;
    }

    @Override
    public boolean equals (Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        SeansKoltukBiletId skb = (SeansKoltukBiletId) o;
        return Objects.equals(koltukID, skb.koltukID) &&
                Objects.equals(seansID, skb.seansID) &&
                Objects.equals(biletID, skb.biletID);
    }

    @Override
    public int hashCode(){
        return Objects.hash(koltukID, seansID, biletID);
    }
}
