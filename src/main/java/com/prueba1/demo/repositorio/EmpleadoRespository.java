
package com.prueba1.demo.repositorio;

import com.prueba1.demo.entity.Cliente;
import com.prueba1.demo.entity.Empleado;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface EmpleadoRespository extends JpaRepository<Empleado, Long>{
    
     // Funcion para mostrar todos las categorias habilitadas
    @Query("select e from Empleado e where e.estado='1'") 
    List<Empleado> findAllCustom();
}
