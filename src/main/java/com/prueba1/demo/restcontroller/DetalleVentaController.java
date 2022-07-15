/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba1.demo.restcontroller;

import com.prueba1.demo.entity.DetalleVenta;
import com.prueba1.demo.entity.Ventas;
import com.prueba1.demo.service.DetalleVentasService;
import com.prueba1.demo.service.VentasService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/detalleventa")
public class DetalleVentaController {
    
     @Autowired
    private DetalleVentasService detalleVentasService;
    
    //Para poder obtener valores utilizamos la anotacion GetMapping
    @GetMapping
    public List<DetalleVenta> finAll(){
        return detalleVentasService.findAll();
    }
    
     @GetMapping("/{id}")
    public Optional<DetalleVenta> findById(@PathVariable long id){
        return detalleVentasService.findById(id);
    }
    
    //Emviar valores
    @PostMapping
    public DetalleVenta add(@RequestBody DetalleVenta p){
        return detalleVentasService.add(p);
    }
    
    //Actualizar valores
    @PutMapping("/{id}")
    public  DetalleVenta update (@PathVariable Long id, @RequestBody DetalleVenta p){
        p.setCodigo(id);
        return detalleVentasService.update(p);
    }
    
    
}
