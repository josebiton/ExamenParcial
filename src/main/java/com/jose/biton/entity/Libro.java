package com.jose.biton.entity;

import javax.persistence.Column;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name="libro")
public class Libro {
     @Id
    @Column(name="lib_id") 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long libId;

  @Column(name="lib_nombre")
    private String libNombre;

  @Column(name = "lib_descripcion")
    private String libDescripcion;
  
  @Column(name="lib_autor")
  private String libAutor;

  @Column(name = "lib_año_publicacion")
    private long libAnoPublicado;
  
  @ManyToOne
    @JoinColumn(name="edit_id")
    private Editorial editorial;

}
