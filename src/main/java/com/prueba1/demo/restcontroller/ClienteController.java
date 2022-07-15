/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba1.demo.restcontroller;

import com.prueba1.demo.entity.Cliente;
import com.prueba1.demo.service.ClienteService;
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

@RequestMapping("/cliente")
public class ClienteController {
    
     
    @Autowired
    private ClienteService clienteService;
    
    //Para poder obtener valores utilizamos la anotacion GetMapping
    @GetMapping
    public List<Cliente> finAll(){
        return clienteService.findAll();
    }
    
    @GetMapping("/custom")//trae los de estado true
    public List<Cliente> findAllCustom(){
        return clienteService.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Cliente> findById(@PathVariable long id){
        return clienteService.findById(id);
    }
    
    //Emviar valores
    @PostMapping
    public Cliente add(@RequestBody Cliente c){
        return clienteService.add(c);
    }
    
    //Actualizar valores
    @PutMapping("/{id}")
    public  Cliente update (@PathVariable Long id, @RequestBody Cliente c){
        c.setCodigo(id);
        return clienteService.update(c);
    }
    
    //eliminar Valores
    @DeleteMapping("/{id}")
    public  Cliente delete (@PathVariable Long id){
        Cliente objCliente = new Cliente();
        objCliente.setCodigo(id);
        return clienteService.delete(objCliente);
    }
    
}
