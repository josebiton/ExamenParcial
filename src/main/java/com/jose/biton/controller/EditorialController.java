package com.jose.biton.controller;

import com.jose.biton.entity.Editorial;
import com.jose.biton.service.EditorialService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/editorial")
@Api(value = "editorial")
public class EditorialController {
    @Autowired
    EditorialService editorialService;
    @ApiOperation(value = "lista de editoriales")
    @GetMapping
    public List<Editorial>findAll(){
        return editorialService.findAll();
    }
    @ApiOperation(value = "lISTA DE editoriales")
    @GetMapping(value = "/{id}")
    public ResponseEntity<Editorial>findById(@PathVariable long id){
      Editorial editorial=editorialService.findById(id);
        return ResponseEntity.ok(editorial);
    }
    @ApiOperation(value = "Crea un registro")
    @PostMapping
    public Editorial save(@RequestBody Editorial editorial) {
        return editorialService.save(editorial);}

    @ApiOperation(value = "Elimina un registro")
    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Long id) {
        editorialService.deleteById(id);}

}
