package com.threepillar.dataExample.ejemplos.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="Empleado")
public class Empleado {
    @Id
    private String id;
    private String nombre;
    private String edad;
    private double salario;
}
