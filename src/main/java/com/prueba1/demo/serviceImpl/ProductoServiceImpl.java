/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba1.demo.serviceImpl;

import com.prueba1.demo.entity.Empleado;
import com.prueba1.demo.entity.Producto;
import com.prueba1.demo.repositorio.EmpleadoRespository;
import com.prueba1.demo.repositorio.ProductoRepository;
import com.prueba1.demo.service.ProductoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl implements ProductoService {
    
    @Autowired
    private ProductoRepository  productoRepository;

    @Override
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    @Override
    public List<Producto> findAllCustom() {
        return  productoRepository.findAllCustom();
    }

    @Override
    public List<Producto> findbyName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<Producto> findById(Long id) {
        return productoRepository.findById(id);
    }

    @Override
    public Producto add(Producto p) {
         return productoRepository.save(p);
    }

    @Override
    public Producto update(Producto p) {
        Producto objEProducto = productoRepository.getById(p.getCodigo());
        BeanUtils.copyProperties(p, objEProducto);
        return productoRepository.save(objEProducto);
    }

    @Override
    public Producto delete(Producto p) {
        Producto objEProducto = productoRepository.getById(p.getCodigo());
        objEProducto.setEstado(false);
        return productoRepository.save(objEProducto);
    }
    
}
