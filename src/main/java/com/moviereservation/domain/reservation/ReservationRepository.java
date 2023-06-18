package com.moviereservation.domain.reservation;

import com.moviereservation.domain.reservation.domain.Seat;
import com.moviereservation.domain.reservation.domain.Seats;

public interface ReservationRepository {
    int reserve(long scheduleId, Seats seats);

    Seat findSeat(long scheduleId, Seat seat);
}
