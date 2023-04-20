package com.threepillar.dataExample.ejemplos.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Autor")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String name;

    @Column(name = "correo")
    private String email;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "authors", cascade = CascadeType.ALL)
    @JsonBackReference
    private Set<Book> books = new HashSet<>();

}