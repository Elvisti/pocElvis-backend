package com.elvis.pocBackend.adapter.mapper;

import com.elvis.pocBackend.adapter.rest.dto.UserDto;
import com.elvis.pocBackend.domain.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto userToUserDto(User user);

    User userDtoToUser(UserDto userDto);
}
