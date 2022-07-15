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
@Entity(name ="Empleado")
@Table(name ="empleado")
public class Empleado implements Serializable{
    
    private static final long serialVersion=1L;
    
     @Id
    //defines la columna
    @Column(name = "idemple")
    private long codigo;
    
    @Column(name = "dniemple")
    private String dni;
    
    @Column(name = "nomemple")
    private String nombre;
    
    @Column(name = "telemple")
    private String telefono;
    
    
    @Column(name = "users")
    private String user;
    
    
    @Column(name = "estemple")
    private boolean estado;
}
