package com.github.celsorv.citiesapi.countries.repositories;

import com.github.celsorv.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
