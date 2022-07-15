/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba1.demo.serviceImpl;

import com.prueba1.demo.entity.DetalleVenta;
import com.prueba1.demo.entity.Ventas;
import com.prueba1.demo.repositorio.DetalleVentaRepository;
import com.prueba1.demo.repositorio.VentasRepository;
import com.prueba1.demo.service.DetalleVentasService;
import com.prueba1.demo.service.VentasService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleVentaServiceImpl implements DetalleVentasService{

    @Autowired
    private DetalleVentaRepository detalleVentaRepository;
    
    @Override
    public List<DetalleVenta> findAll() {
        return detalleVentaRepository.findAll();
    }

    @Override
    public List<DetalleVenta> findAllCustom() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DetalleVenta> findbyName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<DetalleVenta> findById(Long id) {
        return detalleVentaRepository.findById(id);
    }

    @Override
    public DetalleVenta add(DetalleVenta dv) {
        return detalleVentaRepository.save(dv);
    }

    @Override
    public DetalleVenta update(DetalleVenta dv) {
        DetalleVenta objVentas = detalleVentaRepository.getById(dv.getCodigo());
        BeanUtils.copyProperties(dv, objVentas);
        return detalleVentaRepository.save(objVentas);
    }

    @Override
    public DetalleVenta delete(DetalleVenta dv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
