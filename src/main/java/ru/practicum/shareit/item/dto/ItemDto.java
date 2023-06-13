package ru.practicum.shareit.item.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import ru.practicum.shareit.booking.dto.BookingShortDto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * TODO Sprint add-controllers.
 */
@Getter
@Setter
@Builder
public class ItemDto {
    private long id;// id вещи
    @NotBlank(message = "Name cannot be empty or null")
    private String name;// название
    @NotBlank(message = "Name cannot be empty or null")
    private String description;
    @NotNull(message = "Available cannot be null")
    private Boolean available;//статус вещи
    private BookingShortDto lastBooking;
    private BookingShortDto nextBooking;
    private List<CommentDto> comments;
}
