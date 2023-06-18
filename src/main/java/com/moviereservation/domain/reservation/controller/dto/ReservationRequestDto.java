package com.moviereservation.domain.reservation.controller.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@NoArgsConstructor(force = true)
@Getter
@ToString
public class ReservationRequestDto {
    private final String selected;
}
