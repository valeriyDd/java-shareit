package ru.practicum.shareit.booking.dto;

import lombok.Data;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
@Data
public class BookingShortDto {
    private long id;
    private long bookerId;
    private LocalDateTime start;
}
