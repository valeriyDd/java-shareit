package ru.practicum.shareit.user.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import ru.practicum.shareit.util.validation.CreateValidationGroup;
import ru.practicum.shareit.util.validation.UpdateValidationGroup;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Builder
public class UserDto {
    private Long id;
    @NotBlank(groups = CreateValidationGroup.class)
    private String name;
    @NotBlank(groups = CreateValidationGroup.class)
    @Email(groups = {UpdateValidationGroup.class, CreateValidationGroup.class})
    private String email;
}
