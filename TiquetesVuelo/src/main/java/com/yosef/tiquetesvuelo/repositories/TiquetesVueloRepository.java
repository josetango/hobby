package com.yosef.tiquetesvuelo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yosef.tiquetesvuelo.models.TiquetesVuelo;

@Repository
public interface TiquetesVueloRepository extends CrudRepository<TiquetesVuelo, Long> {

}