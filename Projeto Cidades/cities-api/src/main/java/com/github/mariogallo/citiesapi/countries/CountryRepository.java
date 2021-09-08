package com.github.mariogallo.citiesapi.countries;

import com.github.mariogallo.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface CountryRepository extends JpaRepository<Country, Long> {
    List<Country> findAll(Pageable page);
}
