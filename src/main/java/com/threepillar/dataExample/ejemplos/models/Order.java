package com.threepillar.dataExample.ejemplos.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "Orden")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @EmbeddedId
    private OrderId id;

    @Column(name = "fecha")
    private LocalDate orderDate;
}
