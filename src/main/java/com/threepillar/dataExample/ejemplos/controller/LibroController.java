package com.threepillar.dataExample.ejemplos.controller;

import com.threepillar.dataExample.ejemplos.models.Book;
import com.threepillar.dataExample.ejemplos.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class LibroController {

    @Autowired
    LibroService libroService;

    @PostMapping
    public ResponseEntity<Book> add(@RequestBody Book book) {
        return ResponseEntity.ok(libroService.insertBookWithAuthors(book));
    }
}
