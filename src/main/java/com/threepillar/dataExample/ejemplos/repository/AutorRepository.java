package com.threepillar.dataExample.ejemplos.repository;

import com.threepillar.dataExample.ejemplos.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<Author, Long> {

}
