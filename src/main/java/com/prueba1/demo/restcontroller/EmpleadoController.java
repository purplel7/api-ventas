/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba1.demo.restcontroller;

import com.prueba1.demo.entity.Cliente;
import com.prueba1.demo.entity.Empleado;
import com.prueba1.demo.service.EmpleadoService;
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

@RequestMapping("/empleado")
public class EmpleadoController {
    
    @Autowired
    private EmpleadoService empleadoService;
    
     @GetMapping
    public List<Empleado> finAll(){
        return empleadoService.findAll();
    }
    
    @GetMapping("/custom")//trae los de estado true
    public List<Empleado> findAllCustom(){
        return empleadoService.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Empleado> findById(@PathVariable long id){
        return empleadoService.findById(id);
    }
    
    //Emviar valores
    @PostMapping
    public Empleado add(@RequestBody Empleado e){
        return empleadoService.add(e);
    }
    
    //Actualizar valores
    @PutMapping("/{id}")
    public  Empleado update (@PathVariable Long id, @RequestBody Empleado e){
        e.setCodigo(id);
        return empleadoService.update(e);
    }
    
    //eliminar Valores
    @DeleteMapping("/{id}")
    public  Empleado delete (@PathVariable Long id){
        Empleado objEmpleado = new Empleado();
        objEmpleado.setCodigo(id);
        return empleadoService.delete(objEmpleado);
    }
    
}
