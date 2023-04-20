package com.threepillar.dataExample.ejemplos.repository;

import com.threepillar.dataExample.ejemplos.models.Empleado;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpleadoRepository extends MongoRepository<Empleado, String> {

    List<Empleado> findByNombre(String nombre);
}
