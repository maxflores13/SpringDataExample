package com.threepillar.dataExample.store.services;

import com.threepillar.dataExample.store.models.Producto;
import com.threepillar.dataExample.store.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ProductoService {
    @Autowired
    ProductoRepository productoRepository;

    @Transactional
    public Producto add(Producto producto){
        productoRepository.save(producto);
        return producto;
    }
}
