/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba1.demo.serviceImpl;

import com.prueba1.demo.entity.Producto;
import com.prueba1.demo.entity.Ventas;
import com.prueba1.demo.repositorio.VentasRepository;
import com.prueba1.demo.service.VentasService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentasServiceImpl implements VentasService{
    
    @Autowired
    private VentasRepository ventasRepository;

    @Override
    public List<Ventas> findAll() {
        return ventasRepository.findAll();
    }

    @Override
    public List<Ventas> findAllCustom() {
        return  ventasRepository.findAllCustom();
    }

    @Override
    public List<Ventas> findbyName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<Ventas> findById(Long id) {
        return ventasRepository.findById(id);
    }

    @Override
    public Ventas add(Ventas v) {
        return ventasRepository.save(v);
    }

    @Override
    public Ventas update(Ventas v) {
        Ventas objVentas = ventasRepository.getById(v.getCodigo());
        BeanUtils.copyProperties(v, objVentas);
        return ventasRepository.save(objVentas);
    }

    @Override
    public Ventas delete(Ventas v) {
        Ventas objVentas= ventasRepository.getById(v.getCodigo());
        objVentas.setEstado(false);
        return ventasRepository.save(objVentas);
    }
    
}
