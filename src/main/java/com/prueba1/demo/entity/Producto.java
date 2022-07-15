/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba1.demo.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder 
@NoArgsConstructor
@AllArgsConstructor
@Data 
@Entity(name ="Producto")
@Table(name ="producto")
public class Producto implements Serializable{
    
     private static final long serialVersion=1L;
    
     @Id
    //defines la columna
    @Column(name = "idproducto")
    private long codigo;
    
    @Column(name = "nombres")
    private String nombre;
    
    @Column(name = "precio")
    private double precio;
    
    
    @Column(name = "stock")
    private int stock;
    
    
    @Column(name = "estado")
    private boolean estado;
}
