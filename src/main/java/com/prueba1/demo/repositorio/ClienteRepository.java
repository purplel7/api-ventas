/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.prueba1.demo.repositorio;

import com.prueba1.demo.entity.Cliente;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author xows_
 */
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    
    
     // Funcion para mostrar todos las categorias habilitadas
    @Query("select c from Cliente c where c.estado='1'") 
    List<Cliente> findAllCustom();
}
