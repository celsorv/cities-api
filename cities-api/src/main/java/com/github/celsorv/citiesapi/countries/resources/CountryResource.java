package com.github.celsorv.citiesapi.countries.resources;

import com.github.celsorv.citiesapi.countries.entities.Country;
import com.github.celsorv.citiesapi.countries.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountryResource {

   @Autowired
   private CountryRepository repository;

   @GetMapping
   public Page<Country> countries(Pageable page) {
      return repository.findAll(page);
   }

   @GetMapping("/{id}")
   public ResponseEntity<Country> getOne(@PathVariable Long id) {
      Optional<Country> optional = repository.findById(id);

      return optional.map(country -> ResponseEntity.ok().body(country))
                     .orElseGet(() -> ResponseEntity.notFound().build());
   }

}
