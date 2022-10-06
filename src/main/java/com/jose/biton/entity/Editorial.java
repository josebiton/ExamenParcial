/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jose.biton.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;


/**
 *
 * @author LENOVO
 */
@Data
@Entity
@Table(name="editorial")
public class Editorial {
    @Id
    @Column(name="edit_id") 
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long editId;

  @Column(name="edit_nombre")
    private String editNombre;

  @Column(name = "edit_descripcion")
    private String editDescripcion;
  
    
}
