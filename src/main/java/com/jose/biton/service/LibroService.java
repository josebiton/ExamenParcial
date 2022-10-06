package com.jose.biton.service;

import com.jose.biton.entity.Editorial;
import com.jose.biton.entity.Libro;

import java.util.List;

public interface LibroService {
    public List<Libro> findAll();

    public Libro findById(Long id);

    public Libro save(Libro libro);

    public void delete(Libro libro);

    public void deleteById(Long id);
}
