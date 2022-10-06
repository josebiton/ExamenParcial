package com.jose.biton.service.impl;

import com.jose.biton.entity.Editorial;
import com.jose.biton.entity.Libro;
import com.jose.biton.repository.LibroRepository;
import com.jose.biton.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LibroServiceImpl implements LibroService {
   @Autowired
    LibroRepository libroRepository;
    @Override
    public List<Libro> findAll() {
        return (List<Libro>) libroRepository.findAll();
    }

    @Override
    public Libro findById(Long id) {
        return libroRepository.findById(id).orElse(null);
    }

    @Override
    public Libro save(Libro libro) {
        return libroRepository.save(libro);
    }

    @Override
    public void delete(Libro libro) {
        libroRepository.delete(libro);
    }

    @Override
    public void deleteById(Long id) {
        libroRepository.deleteById(id);
    }
}
