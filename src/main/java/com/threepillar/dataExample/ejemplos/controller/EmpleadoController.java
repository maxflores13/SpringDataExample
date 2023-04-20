package com.threepillar.dataExample.ejemplos.controller;

import com.threepillar.dataExample.ejemplos.services.EmpleadoService;
import com.threepillar.dataExample.ejemplos.models.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmpleadoController {
    @Autowired
    EmpleadoService empleadoService;

    @PostMapping
    public ResponseEntity<Empleado> add(@RequestBody Empleado empleado){
       return ResponseEntity.ok(empleadoService.add(empleado));
    }
}
