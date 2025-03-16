package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class EtkinlikSalonSeansId implements Serializable {

    private Long EtkinlikID;
    private Long SalonID;
    private Long SeansID;

    public EtkinlikSalonSeansId() {
    }

    public EtkinlikSalonSeansId(Long EtkinlikID, Long SalonID, Long SeansID) {
        this.EtkinlikID = EtkinlikID;
        this.SalonID = SalonID;
        this.SeansID = SeansID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EtkinlikSalonSeansId essId = (EtkinlikSalonSeansId) o;
        return Objects.equals(EtkinlikID, essId.EtkinlikID)
                && Objects.equals(SalonID, essId.SalonID)
                && Objects.equals(SeansID, essId.SeansID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(EtkinlikID, SalonID, SeansID);
    }

}
