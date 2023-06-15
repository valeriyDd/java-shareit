package ru.practicum.shareit.item.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import ru.practicum.shareit.booking.dto.BookingShortDto;
import ru.practicum.shareit.util.validation.CreateValidationGroup;

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
    private long id;//уникальный идентификатор вещи
    @NotBlank(groups = CreateValidationGroup.class)
    private String name;//краткое название
    @NotBlank(groups = CreateValidationGroup.class)
    private String description;//развёрнутое описание
    @NotNull(groups = CreateValidationGroup.class)
    private Boolean available;//статус о том, доступна или нет вещь для аренды
    private BookingShortDto lastBooking;
    private BookingShortDto nextBooking;
    private List<CommentDto> comments;
}
