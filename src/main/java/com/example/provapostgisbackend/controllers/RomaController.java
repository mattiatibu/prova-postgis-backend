package com.example.provapostgisbackend.controllers;

import com.example.provapostgisbackend.entities.City;
import com.example.provapostgisbackend.entities.Roma;
import com.example.provapostgisbackend.services.RomaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "roma")
public class RomaController {
    private RomaService romaService;

    @Autowired
    public RomaController(RomaService romaService) {
        this.romaService = romaService;
    }

    @GetMapping(path = "buildings")
    public Page<Roma> getRomaPage(Pageable pageable){
        return romaService.findAll(pageable);
    }

}
