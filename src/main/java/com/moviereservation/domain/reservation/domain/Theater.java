package com.moviereservation.domain.reservation.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@Getter
public class Theater {
    private final List<Seats> theater;
}
