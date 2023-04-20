package com.threepillar.dataExample.ejemplos.services;

import com.threepillar.dataExample.ejemplos.models.Course;
import com.threepillar.dataExample.ejemplos.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public List<Course> findByName(String name) {
        return cursoRepository.findByName(name);
    }

    public Course addCurso(Course curso) {
        return cursoRepository.save(curso);
    }
}
