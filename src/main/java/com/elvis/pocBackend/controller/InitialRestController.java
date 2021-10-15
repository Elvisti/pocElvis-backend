package com.elvis.pocBackend.controller;

import com.elvis.pocBackend.domain.Initial;
import com.elvis.pocBackend.service.InitialService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("initial")
public class InitialRestController {

    private final InitialService initialService;

    public InitialRestController(InitialService initialService) {
        this.initialService = initialService;
    }

    @GetMapping()
    public List<Initial> listInitial() {
        return initialService.listAll();

    }

}
