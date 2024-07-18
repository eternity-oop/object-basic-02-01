package org.eternity.reservation.persistence;

import org.eternity.reservation.domain.Reservation;

public interface ReservationDAO {
    void insert(Reservation reservation);
}
