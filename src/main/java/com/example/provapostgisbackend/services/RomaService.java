package com.example.provapostgisbackend.services;

import com.example.provapostgisbackend.entities.Roma;
import com.example.provapostgisbackend.repositories.RomaRepository;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.PrecisionModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class RomaService {
    private RomaRepository romaRepository;


    private GeometryFactory factory = new GeometryFactory(new PrecisionModel(), 4326);

    @Autowired
    public RomaService(RomaRepository romaRepository) {
        this.romaRepository = romaRepository;
    }

    public Page<Roma> findAll(Pageable page){
        return romaRepository.findAll(page);
    }


}
