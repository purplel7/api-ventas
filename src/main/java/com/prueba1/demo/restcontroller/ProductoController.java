/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba1.demo.restcontroller;


import com.prueba1.demo.entity.Empleado;
import com.prueba1.demo.entity.Producto;

import com.prueba1.demo.service.ProductoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/producto")
public class ProductoController {
    
    @Autowired
    private ProductoService productoService;
    
     @GetMapping
    public List<Producto> finAll(){
        return productoService.findAll();
    }
    
    @GetMapping("/custom")//trae los de estado true
    public List<Producto> findAllCustom(){
        return productoService.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Producto> findById(@PathVariable long id){
        return productoService.findById(id);
    }
    
    //Emviar valores
    @PostMapping
    public Producto add(@RequestBody Producto p){
        return productoService.add(p);
    }
    
    //Actualizar valores
    @PutMapping("/{id}")
    public  Producto update (@PathVariable Long id, @RequestBody Producto p){
        p.setCodigo(id);
        return productoService.update(p);
    }
    
    //eliminar Valores
    @DeleteMapping("/{id}")
    public  Producto delete (@PathVariable Long id){
        Producto objProducto = new Producto();
        objProducto.setCodigo(id);
        return productoService.delete(objProducto);
    }
    
}
