package ru.practicum.shareit.booking.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import ru.practicum.shareit.booking.model.BookingFilter;
import ru.practicum.shareit.booking.filter.All;
import ru.practicum.shareit.booking.filter.Current;
import ru.practicum.shareit.booking.filter.Future;
import ru.practicum.shareit.booking.filter.PastBookings;
import ru.practicum.shareit.booking.filter.Rejected;
import ru.practicum.shareit.booking.filter.Waiting;
import ru.practicum.shareit.util.Filter;

@Getter
@RequiredArgsConstructor
public enum BookingState {
    ALL(new All()),
    CURRENT(new Current()),//текущие
    PAST(new PastBookings()),//завершённые
    FUTURE(new Future()),//будущие
    WAITING(new Waiting()),//ожидающие подтверждения
    REJECTED(new Rejected());//отклонённые

    private final Filter<BookingFilter> stateFilter;
}
