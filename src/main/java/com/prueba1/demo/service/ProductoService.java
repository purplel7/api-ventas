/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.prueba1.demo.service;

import com.prueba1.demo.entity.Producto;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author xows_
 */
public interface ProductoService {
    
    List<Producto> findAll(); // Mostrar Todo
    List<Producto> findAllCustom();    //Mostrar todos los habilitdos
    List<Producto> findbyName();   //Buscar por nombre
    Optional<Producto>  findById(Long id); //Buscar por id
    Producto add(Producto p);     //Agregar
    Producto update(Producto p);  //Actualizar
    Producto delete(Producto p);  //Eliminar
}
