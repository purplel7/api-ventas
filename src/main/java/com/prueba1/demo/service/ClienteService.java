/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.prueba1.demo.service;

import com.prueba1.demo.entity.Cliente;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author xows_
 */
public interface ClienteService {
     
    List<Cliente> findAll(); // Mostrar Todo
    List<Cliente> findAllCustom();    //Mostrar todos los habilitdos
    List<Cliente> findbyName();   //Buscar por nombre
    Optional<Cliente>  findById(Long id); //Buscar por id
    Cliente add(Cliente c);     //Agregar
    Cliente update(Cliente c);  //Actualizar
    Cliente delete(Cliente c);  //Eliminar
    
}
