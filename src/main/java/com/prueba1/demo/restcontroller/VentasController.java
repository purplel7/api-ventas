/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba1.demo.restcontroller;

import com.prueba1.demo.entity.Ventas;
import com.prueba1.demo.service.VentasService;
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
@RequestMapping("/ventas")
public class VentasController {
    
     
    @Autowired
    private VentasService ventasService;
    
    //Para poder obtener valores utilizamos la anotacion GetMapping
    @GetMapping
    public List<Ventas> finAll(){
        return ventasService.findAll();
    }
    
     @GetMapping("/custom")//trae los de estado true
    public List<Ventas> findAllCustom(){
        return ventasService.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Ventas> findById(@PathVariable long id){
        return ventasService.findById(id);
    }
    
    //Emviar valores
    @PostMapping
    public Ventas add(@RequestBody Ventas p){
        return ventasService.add(p);
    }
    
    //Actualizar valores
    @PutMapping("/{id}")
    public  Ventas update (@PathVariable Long id, @RequestBody Ventas p){
        p.setCodigo(id);
        return ventasService.update(p);
    }
    
    //eliminar Valores
    @DeleteMapping("/{id}")
    public  Ventas delete (@PathVariable Long id){
        Ventas objProducto = new Ventas();
        objProducto.setCodigo(id);
        return ventasService.delete(objProducto);
    }
}
