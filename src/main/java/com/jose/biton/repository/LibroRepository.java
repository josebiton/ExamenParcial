package com.jose.biton.repository;

import com.jose.biton.entity.Libro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends CrudRepository<Libro, Long> {
}
