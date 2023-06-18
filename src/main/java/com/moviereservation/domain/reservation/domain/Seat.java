package com.moviereservation.domain.reservation.domain;

import lombok.*;
import org.springframework.jdbc.core.RowMapper;

@Builder
@EqualsAndHashCode
@RequiredArgsConstructor
@Getter
@ToString
public class Seat {
    private final SeatStatus status;
    private final int row;
    private final int column;

    public static final RowMapper<Seat> seatMapper = (rs, rowNum) -> {
        return Seat.builder()
                .status(SeatStatus.of(rs.getString("status")))
                .row(rs.getInt("seat_row"))
                .column(rs.getInt("seat_column"))
                .build();
    };
}
