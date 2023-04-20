package com.threepillar.dataExample.ejemplos.controller;

import com.threepillar.dataExample.ejemplos.models.Course;
import com.threepillar.dataExample.ejemplos.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CursoController {

    @Autowired
    CursoService cursoService;

    @GetMapping("/name/{name}")
    public ResponseEntity<List<Course>> findByName(@PathVariable String name){
        return ResponseEntity.ok(cursoService.findByName(name));
    }

    @PostMapping
    public ResponseEntity<Course> add(@RequestBody Course curso){
        return  ResponseEntity.ok(cursoService.addCurso(curso));
    }
}
