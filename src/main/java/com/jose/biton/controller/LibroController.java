package com.jose.biton.controller;


import com.jose.biton.entity.Libro;
import com.jose.biton.service.LibroService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libro")
@Api(value = "libro")
public class LibroController {
    @Autowired
    LibroService libroService;
    @ApiOperation(value = "lista de editoriales")
    @GetMapping
    public List<Libro> findAll(){
        return libroService.findAll();
    }
    @ApiOperation(value = "lISTA DE Libros")
    @GetMapping(value = "/{id}")
    public ResponseEntity<Libro> findById(@PathVariable long id){
        Libro libro=libroService.findById(id);
        return ResponseEntity.ok(libro);}
    @ApiOperation(value = "Crea un registro")
    @PostMapping
    public Libro save(@RequestBody Libro libro) {
        return libroService.save(libro);
    }
    @ApiOperation(value = "Elimina un registro")
    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Long id) {
        libroService.deleteById(id);}
}
