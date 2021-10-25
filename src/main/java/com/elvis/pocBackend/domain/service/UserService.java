package com.elvis.pocBackend.domain.service;

import com.elvis.pocBackend.application.exception.UserRepositoryException;
import com.elvis.pocBackend.domain.model.User;

import java.util.List;

public interface UserService {

    List<User> listAll();

    User createUser(User user) throws UserRepositoryException;

}
