package kr.luciddevlog.reservation.booking.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
@Builder
public class BookingFormDto {
    private Long roomId;
    private Long userId;
    private String memo;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private Integer people;
}
