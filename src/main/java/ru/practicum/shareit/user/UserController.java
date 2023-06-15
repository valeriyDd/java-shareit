package ru.practicum.shareit.user;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import ru.practicum.shareit.user.dto.UserDto;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;

@Slf4j
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@Validated
public class UserController {
    private final UserService service;

    @GetMapping
    public Collection<UserDto> getAll() {
        log.debug("Request received GET '/users'");
        return service.getAll();
    }

    @GetMapping("/{userId}")
    public UserDto getById(@PathVariable(name = "userId") long userId) {
        log.debug("Request received GET '/users/{}'", userId);
        return service.getById(userId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserDto create(
            @Valid @RequestBody UserDto userDto) {
        log.debug("Request received POST '/users' : {}", userDto);
        return service.create(userDto);
    }

    @PatchMapping("/{userId}")
    public UserDto update(
            @PathVariable(name = "userId") long userId, @Valid
            @RequestBody UserDto userDto) {
        log.debug("Request received PATCH '/items/{}' : {}", userId, userDto);
        return service.update(userDto, userId);
    }

    @DeleteMapping("/{userId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable(name = "userId") long userId) {
        log.debug("Request received DELETE '/users/{}'", userId);
        service.delete(userId);
    }
}
