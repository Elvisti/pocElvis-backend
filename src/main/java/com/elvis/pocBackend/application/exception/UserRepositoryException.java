package com.elvis.pocBackend.application.exception;

import com.elvis.pocBackend.domain.model.User;

public class UserRepositoryException extends Exception {
    public UserRepositoryException(User user) {
        super("Could persist the Person first name=" + user.getName());
    }
}
