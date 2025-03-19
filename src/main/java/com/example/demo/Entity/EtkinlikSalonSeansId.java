package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class EtkinlikSalonSeansId implements Serializable {

    private Long etkinlikID;
    private Long salonID;
    private Long seansID;

    public EtkinlikSalonSeansId() {
    }

    public EtkinlikSalonSeansId(Long etkinlikID, Long salonID, Long seansID) {
        this.etkinlikID = etkinlikID;
        this.salonID = salonID;
        this.seansID = seansID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EtkinlikSalonSeansId essId = (EtkinlikSalonSeansId) o;
        return Objects.equals(etkinlikID, essId.etkinlikID)
                && Objects.equals(salonID, essId.salonID)
                && Objects.equals(seansID, essId.seansID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(etkinlikID, salonID, seansID);
    }

}
