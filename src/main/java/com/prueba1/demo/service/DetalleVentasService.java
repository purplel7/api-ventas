/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.prueba1.demo.service;

import com.prueba1.demo.entity.DetalleVenta;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author xows_
 */
public interface DetalleVentasService {
    
    List<DetalleVenta> findAll(); // Mostrar Todo
    List<DetalleVenta> findAllCustom();    //Mostrar todos los habilitdos
    List<DetalleVenta> findbyName();   //Buscar por nombre
    Optional<DetalleVenta>  findById(Long id); //Buscar por id
    DetalleVenta add(DetalleVenta dv);     //Agregar
    DetalleVenta update(DetalleVenta dv);  //Actualizar
    DetalleVenta delete(DetalleVenta dv);  //Eliminar
}
