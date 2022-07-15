/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.prueba1.demo.repositorio;

import com.prueba1.demo.entity.DetalleVenta;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author xows_
 */
public interface DetalleVentaRepository extends JpaRepository<DetalleVenta, Long>{
    
   
}
