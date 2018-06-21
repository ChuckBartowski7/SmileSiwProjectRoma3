package com.boraji.tutorial.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.boraji.tutorial.springboot.model.*;

public interface EventoRepository extends CrudRepository<Evento, Long> {

}
