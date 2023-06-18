package com.moviereservation.domain.reservation.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.List;

@EqualsAndHashCode
@RequiredArgsConstructor
@Getter
@ToString
public class Seats {
    private final List<Seat> seats;
}
