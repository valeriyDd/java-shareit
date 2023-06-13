package ru.practicum.shareit.request.dto;

import java.util.Date;

/**
 * TODO Sprint add-item-requests.
 */

public class ItemRequestDto {
    private Long id;
    private String description;// текст запроса, содержащий описание требуемой вещи
    private Long requestor;// пользователь
    private Date created;

}
