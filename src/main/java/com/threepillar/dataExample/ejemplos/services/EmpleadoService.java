package com.threepillar.dataExample.ejemplos.services;


import com.threepillar.dataExample.ejemplos.models.Empleado;
import com.threepillar.dataExample.ejemplos.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService {
    @Autowired
    private EmpleadoRepository empleadoRepository;

    public Empleado add(Empleado empleado){
        return empleadoRepository.save(empleado);
    }
}
