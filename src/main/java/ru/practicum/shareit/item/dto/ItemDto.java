package ru.practicum.shareit.item.dto;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * TODO Sprint add-controllers.
 */
@Getter
@Setter
@EqualsAndHashCode
@Builder
public class ItemDto {
    private long id;
    @NotBlank(message = "Name cannot be empty or null")
    private String name;
    @NotBlank(message = "Name cannot be empty or null")
    private String description;
    @NotNull(message = "Available cannot be null")
    private Boolean available;
    private Long request;
    //Тут либо с тестами постмана что-то, либо я не понял.
    //Видимо это нам дальше пригодится, но пришлось прописать тк тесты :-\
}
