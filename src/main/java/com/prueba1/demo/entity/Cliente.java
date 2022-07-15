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

@Builder //Contruccion
@NoArgsConstructor //metodo constructor sin parametros
@AllArgsConstructor //metodo constructor con parametros
@Data //metodos get y set
//definiendo la entidad para la persistencia de datos
@Entity(name ="Cliente")
//definiendo la tabla de la base de datos
@Table(name ="cliente")
public class Cliente implements Serializable{
    
    
    private static final long serialVersion=1L;
    //-------------------------------------
    
    @Id
    //defines la columna
    @Column(name = "idcli")
    private long codigo;
    
    @Column(name = "dnicli")
    private String dni;
    
    @Column(name = "nombrescli")
    private String nombre;
    
    @Column(name = "direccioncli")
    private String direccion;
    
    
    @Column(name = "estadocli")
    private boolean estado;
}
