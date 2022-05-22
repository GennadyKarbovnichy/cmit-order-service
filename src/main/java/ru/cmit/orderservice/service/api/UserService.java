package ru.cmit.orderservice.service.api;

import lombok.NonNull;
import ru.cmit.orderservice.controller.dto.user.UserResponse;
import ru.cmit.orderservice.entity.UserEntity;

import java.util.List;

public interface UserService {
    UserEntity getUserEntityById(@NonNull Long id);

    UserResponse getUserById(@NonNull Long id);

    List<UserResponse> getAllUsers();

    UserResponse getUserByLogin(@NonNull String login);
}
