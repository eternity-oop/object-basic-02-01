package org.eternity.reservation.persistence.memory;

import org.eternity.reservation.domain.Reservation;
import org.eternity.reservation.persistence.ReservationDAO;

public class ReservationMemoryDAO extends InMemoryDAO<Reservation> implements ReservationDAO {
    @Override
    public void insert(Reservation reservation) {
        super.insert(reservation);
    }
}
