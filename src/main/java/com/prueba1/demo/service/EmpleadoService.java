/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.prueba1.demo.service;

import com.prueba1.demo.entity.Empleado;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author xows_
 */
public interface EmpleadoService {
    List<Empleado> findAll(); // Mostrar Todo
    List<Empleado> findAllCustom();    //Mostrar todos los habilitdos
    List<Empleado> findbyName();   //Buscar por nombre
    Optional<Empleado>  findById(Long id); //Buscar por id
    Empleado add(Empleado e);     //Agregar
    Empleado update(Empleado e);  //Actualizar
    Empleado delete(Empleado e);  //Eliminar
    
}
