package com.elvis.pocBackend.application.exception;

public class UserNotFoundException extends Exception {

    public UserNotFoundException(String id) {
        super("Could not find user with id=" + id);
    }
}
