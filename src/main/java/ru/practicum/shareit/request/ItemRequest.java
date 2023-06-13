package ru.practicum.shareit.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * TODO Sprint add-item-requests.
 */
@Getter
@Setter
public class ItemRequest {
    private long id;
    private String description;// текст запроса
    private long requestor;// пользователь
    private Date created;
}
