/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.prueba1.demo.service;

import com.prueba1.demo.entity.Ventas;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author xows_
 */
public interface VentasService {
    
    List<Ventas> findAll(); // Mostrar Todo
    List<Ventas> findAllCustom();    //Mostrar todos los habilitdos
    List<Ventas> findbyName();   //Buscar por nombre
    Optional<Ventas>  findById(Long id); //Buscar por id
    Ventas add(Ventas v);     //Agregar
    Ventas update(Ventas v);  //Actualizar
    Ventas delete(Ventas v);  //Eliminar
}
