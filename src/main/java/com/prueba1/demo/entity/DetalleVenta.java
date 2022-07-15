/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba1.demo.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder 
@NoArgsConstructor 
@AllArgsConstructor 
@Data

@Entity(name ="DetalleVenta")

@Table(name ="detalle_ventas")
public class DetalleVenta implements Serializable{
    
    
     private static final long serialVersion=1L;
    //definiendo la clave primaria
    @Id
    //defines la columna
    @Column(name = "iddetalleventas")
    private long codigo;
    
    @Column(name = "cantidad")
    private int cant;
    
    @Column(name = "precioventa")
    private double preventa;
    
  
    
    @ManyToOne
    @JoinColumn(name ="idventas", nullable = false)
    private Ventas venta;
    
    @ManyToOne
    @JoinColumn(name ="idproducto", nullable = false)
    private Producto producto;
    
}
