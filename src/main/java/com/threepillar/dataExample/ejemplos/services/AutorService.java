package com.threepillar.dataExample.ejemplos.services;

import com.threepillar.dataExample.ejemplos.models.Author;
import com.threepillar.dataExample.ejemplos.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AutorService {

    @Autowired
    AutorRepository autorRepository;

    @Transactional
    public Author insertBookWithAuthors(Author author) {
        autorRepository.save(author);
        return author;
    }

    public List<Author> getAll(){
        return autorRepository.findAll();
    }
}
