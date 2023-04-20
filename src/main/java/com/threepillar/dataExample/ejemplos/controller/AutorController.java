package com.threepillar.dataExample.ejemplos.controller;

import com.threepillar.dataExample.ejemplos.models.Author;
import com.threepillar.dataExample.ejemplos.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AutorController {
    @Autowired
    AutorService autorService;

    @PostMapping
    public ResponseEntity<Author> add(@RequestBody Author author) {
        return ResponseEntity.ok(autorService.insertBookWithAuthors(author));
    }

    @GetMapping
    public ResponseEntity<List<Author>> getAll(){
        return ResponseEntity.ok(autorService.getAll());
    }
}
