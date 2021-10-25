package com.elvis.pocBackend.application.service;

import com.elvis.pocBackend.application.exception.UserRepositoryException;
import com.elvis.pocBackend.domain.model.User;
import com.elvis.pocBackend.domain.repository.UserRepository;
import com.elvis.pocBackend.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> listAll() {
        return userRepository.findAll();
    }

    @Override
    public User createUser(User user) throws UserRepositoryException {
        return userRepository.save(user);
    }
}
