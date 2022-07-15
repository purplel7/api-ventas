/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba1.demo.serviceImpl;

import com.prueba1.demo.entity.Cliente;
import com.prueba1.demo.entity.Empleado;

import com.prueba1.demo.repositorio.EmpleadoRespository;
import com.prueba1.demo.service.EmpleadoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{

    @Autowired
    private EmpleadoRespository empleadoRespository;
    
    @Override
    public List<Empleado> findAll() {
        return empleadoRespository.findAll();
    }

    @Override
    public List<Empleado> findAllCustom() {
        return  empleadoRespository.findAllCustom();
    }

    @Override
    public List<Empleado> findbyName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<Empleado> findById(Long id) {
        return empleadoRespository.findById(id);
    }

    @Override
    public Empleado add(Empleado e) {
        return empleadoRespository.save(e);
    }

    @Override
    public Empleado update(Empleado e) {
        Empleado objEmpleado = empleadoRespository.getById(e.getCodigo());
        BeanUtils.copyProperties(e, objEmpleado);
        return empleadoRespository.save(objEmpleado);
    }

    @Override
    public Empleado delete(Empleado e) {
        Empleado objEmpleado = empleadoRespository.getById(e.getCodigo());
        objEmpleado.setEstado(false);
        return empleadoRespository.save(objEmpleado);
    }
    
}
