package com.example.provapostgisbackend.entities;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.data.geo.Point;
import org.springframework.data.geo.Polygon;

@Entity(name = "rome_buildings")
public class Roma {
    @Id
    @Column(name="osm_id")
    private long id;

    @Column(name="osm_way_id")
    @Nullable
    private long way_id;

    @Column(name="hei_median")
    private long altitude;

    @Column(columnDefinition = "geometry(Polygon,4326)")
    private Polygon geom;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getWay_id() {
        return way_id;
    }

    public void setWay_id(long way_id) {
        this.way_id = way_id;
    }

    public long getAltitude() {
        return altitude;
    }

    public void setAltitude(long altitude) {
        this.altitude = altitude;
    }

    public Polygon getGeom() {
        return geom;
    }

    public void setGeom(Polygon geom) {
        this.geom = geom;
    }
}
