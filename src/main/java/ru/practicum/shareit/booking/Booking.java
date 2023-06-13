package ru.practicum.shareit.booking;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * TODO Sprint add-bookings.
 */
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Booking {
    private long id;
    private long item;
    private long booker;
    private BookingStatus status;
    private Date start;
    private Date end;
}
