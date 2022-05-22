package ru.cmit.orderservice.mapper;

import org.mapstruct.Mapper;
import ru.cmit.orderservice.config.MappersConfig;
import ru.cmit.orderservice.controller.dto.user.UserResponse;
import ru.cmit.orderservice.entity.UserEntity;

import java.util.List;

@Mapper(config = MappersConfig.class)
public interface UserMapper {

    List<UserResponse> toListUserResponse(List<UserEntity> users);

    UserResponse toUserResponse(UserEntity userEntityById);
}
