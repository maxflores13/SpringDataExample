package com.threepillar.dataExample.ejemplos.services;

import com.threepillar.dataExample.ejemplos.models.Order;
import com.threepillar.dataExample.ejemplos.repository.OrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdenService {
    @Autowired
    OrdenRepository ordenRepository;

    public Order add(Order order) {
        ordenRepository.save(order);
        return order;
    }
}
