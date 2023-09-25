package com.example.provapostgisbackend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.data.geo.Point;

@Entity(name = "us_cities")
public class City {

    @Id
    @Column(name="id")
    private long id;

    @Column(name="`POP_2010`")
    private long population2010;

    @Column(name="`ELEV_IN_FT`")
    private long altitude;

    @Column(columnDefinition = "geometry(Point,4326)")
    private Point geom;

}