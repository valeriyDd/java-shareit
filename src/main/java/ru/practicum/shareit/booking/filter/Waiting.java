package ru.practicum.shareit.booking.filter;

import lombok.NoArgsConstructor;
import ru.practicum.shareit.booking.model.BookingFilter;
import ru.practicum.shareit.booking.enums.BookingStatus;
import ru.practicum.shareit.util.Filter;

@NoArgsConstructor
public class Waiting implements Filter<BookingFilter> {
    @Override
    public BookingFilter getFilter(BookingFilter filter) {
        return filter.toBuilder()
                .status(BookingStatus.WAITING)
                .build();
    }
}
