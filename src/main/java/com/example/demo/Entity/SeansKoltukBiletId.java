package com.example.demo.Entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class SeansKoltukBiletId implements Serializable {

    private Long KoltukID;
    private Long SeansID;

    public SeansKoltukBiletId(){
    }

    public SeansKoltukBiletId(Long KoltukID, Long SeansID){
        this.KoltukID = KoltukID;
        this.SeansID = SeansID;
    }

    @Override
    public boolean equals (Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        SeansKoltukBiletId skb = (SeansKoltukBiletId) o;
        return Objects.equals(KoltukID, skb.KoltukID) &&
                Objects.equals(SeansID, skb.SeansID);
    }

    @Override
    public int hashCode(){
        return Objects.hash(KoltukID, SeansID);
    }
}
