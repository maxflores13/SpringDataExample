package com.threepillar.dataExample.ejemplos.repository;

import com.threepillar.dataExample.ejemplos.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository<Book, Long> {

}
