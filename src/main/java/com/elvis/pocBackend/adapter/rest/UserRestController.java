package com.elvis.pocBackend.adapter.rest;

import com.elvis.pocBackend.adapter.mapper.UserMapper;
import com.elvis.pocBackend.adapter.rest.dto.UserDto;
import com.elvis.pocBackend.application.exception.UserRepositoryException;
import com.elvis.pocBackend.domain.model.User;
import com.elvis.pocBackend.domain.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserRestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserRestController.class);

    private static final String CREATED = "User {} created - Returning 201 CREATED";

    @Autowired
    private final UserService service;

    @Autowired
    private final UserMapper mapper;


    public UserRestController(UserService service, UserMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping()
    public ResponseEntity<List<User>> listInitial() {
        LOGGER.info("Received user list");

        final List<User> users = service.listAll();
        return ResponseEntity.ok(users);

    }

    @PostMapping
    public ResponseEntity<UserDto> saveUser(@RequestBody UserDto userDto) throws UserRepositoryException {
        LOGGER.info("Received request create a user");

        final User user = mapper.userDtoToUser(userDto);

        User savedUser = service.createUser(user);

        LOGGER.info(CREATED, savedUser.getId());

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(mapper.userToUserDto(savedUser));
    }

}
