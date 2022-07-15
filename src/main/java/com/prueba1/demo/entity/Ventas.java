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

@Builder //Contruccion
@NoArgsConstructor //metodo constructor sin parametros
@AllArgsConstructor //metodo constructor con parametros
@Data //metodos get y set
//definiendo la entidad para la persistencia de datos
@Entity(name ="Ventas")
//definiendo la tabla de la base de datos
@Table(name ="ventas")
public class Ventas implements Serializable{
    
     private static final long serialVersion=1L;
    //definiendo la clave primaria
    @Id
    //defines la columna
    @Column(name = "idventas")
    private long codigo;
    
    @Column(name = "numeroserie")
    private String numserie;
    
    @Column(name = "fechaventas")
    private String fecha;
    
    @Column(name = "monto")
    private double montoventa;
    
    
    @Column(name = "estado")
    private boolean estado;
    
    @ManyToOne
    @JoinColumn(name ="idcli", nullable = false)
    private Cliente cliente;
    
    @ManyToOne
    @JoinColumn(name ="idemple", nullable = false)
    private Empleado empleado;
}
