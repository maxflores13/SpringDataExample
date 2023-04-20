package com.threepillar.dataExample.store.controller;

import com.threepillar.dataExample.store.models.Producto;
import com.threepillar.dataExample.store.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sproducto")
public class ProductoController {
    @Autowired
    ProductoService productoService;

    @PostMapping
    public ResponseEntity<Producto> add(@RequestBody Producto producto) {
        return ResponseEntity.ok(productoService.add(producto));
    }

}