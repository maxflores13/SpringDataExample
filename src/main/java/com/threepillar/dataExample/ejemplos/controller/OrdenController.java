package com.threepillar.dataExample.ejemplos.controller;

import com.threepillar.dataExample.ejemplos.models.Order;
import com.threepillar.dataExample.ejemplos.services.OrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrdenController {

    @Autowired
    OrdenService ordenService;

    @PostMapping
    public ResponseEntity<Order> add(@RequestBody Order order) {
        return ResponseEntity.ok(ordenService.add(order));
    }
}
