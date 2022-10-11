package com.github.celsorv.citiesapi.states.repositories;

import com.github.celsorv.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}