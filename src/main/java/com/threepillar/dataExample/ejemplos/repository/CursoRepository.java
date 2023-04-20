package com.threepillar.dataExample.ejemplos.repository;

import com.threepillar.dataExample.ejemplos.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CursoRepository extends JpaRepository<Course, Long> {
    List<Course> findByName(String name);
}