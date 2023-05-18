package ru.practicum.shareit.request;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * TODO Sprint add-item-requests.
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ItemRequest {
    private long id;
    private String description;
    private long requestor;
    private Date created;
}
