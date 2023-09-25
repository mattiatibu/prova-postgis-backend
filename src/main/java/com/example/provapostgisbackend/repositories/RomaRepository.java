package com.example.provapostgisbackend.repositories;

import com.example.provapostgisbackend.entities.Roma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RomaRepository extends JpaRepository<Roma, Long> {
}
