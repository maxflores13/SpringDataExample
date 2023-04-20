package com.threepillar.dataExample.ejemplos.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class OrderId implements Serializable {

    @Column(name = "id_cliente")
    private Long customerId;

    @Column(name = "num_orden")
    private Long orderNumber;

}