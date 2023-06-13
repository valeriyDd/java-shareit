package ru.practicum.shareit.booking.dto;

import lombok.Getter;
import lombok.Setter;
import ru.practicum.shareit.booking.BookingStatus;

import java.util.Date;

/**
 * TODO Sprint add-bookings.
 */
@Setter
@Getter
public class BookingDto {
    private long id;
    private long item;
    private long booker;
    private BookingStatus status;
    private Date start;
    private Date end;
}
