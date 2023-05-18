package ru.practicum.shareit.user;

import ru.practicum.shareit.user.dto.UserDto;

import java.util.Collection;

public interface UserService {
    /**
     * Get all users
     * @return collection of user, converted to DTO
     */
    Collection<UserDto> getAll();

    /**
     * Update user's data
     * @param user
     * @param userId
     * @return updates user, converted to DTO
     */
    UserDto update(UserDto user, long userId);

    /**
     * Create new user
     * @param user
     * @return new user, converted to DTO
     */
    UserDto create(UserDto user);

    /**
     * Get user by id
     * @param userId
     * @return user, converted to DTO
     */
    UserDto getById(long userId);

    /**
     * Delete user by id
     * @param userId
     */
    void delete(long userId);

    /**
     * Check user with useId is existing in storage
     * @param userId
     * @return true or false
     */
    boolean existUser(long userId);
}
