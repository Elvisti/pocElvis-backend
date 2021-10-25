package com.elvis.pocBackend.domain.repository;

import com.elvis.pocBackend.domain.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    ArrayList<User> findAll();
}
