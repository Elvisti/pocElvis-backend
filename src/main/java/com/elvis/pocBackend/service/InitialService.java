package com.elvis.pocBackend.service;

import com.elvis.pocBackend.domain.Initial;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InitialService {

    public List<Initial> listAll() {
        return List.of(new Initial("Elvis", 2), new Initial("Eduardo", 25));
    }
}
