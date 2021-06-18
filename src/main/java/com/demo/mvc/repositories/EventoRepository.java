package com.demo.mvc.repositories;

import org.springframework.data.repository.CrudRepository;

import com.demo.mvc.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String> {

}
