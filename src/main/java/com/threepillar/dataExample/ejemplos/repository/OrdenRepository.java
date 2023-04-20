package com.threepillar.dataExample.ejemplos.repository;

import com.threepillar.dataExample.ejemplos.models.Order;
import com.threepillar.dataExample.ejemplos.models.OrderId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdenRepository extends JpaRepository<Order, OrderId> {
}
