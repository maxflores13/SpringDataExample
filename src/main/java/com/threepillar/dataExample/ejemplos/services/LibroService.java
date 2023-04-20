package com.threepillar.dataExample.ejemplos.services;

import com.threepillar.dataExample.ejemplos.models.Book;
import com.threepillar.dataExample.ejemplos.repository.AutorRepository;
import com.threepillar.dataExample.ejemplos.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class LibroService {

    @Autowired
    LibroRepository bookRepository;

    @Autowired
    AutorRepository autorRepository;

    @Transactional
    public Book insertBookWithAuthors(Book book) {

        return bookRepository.save(book);
    }
}