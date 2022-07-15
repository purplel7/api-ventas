
package com.prueba1.demo.repositorio;

import com.prueba1.demo.entity.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author xows_
 */
public interface ProductoRepository extends JpaRepository<Producto, Long>{
    
     // Funcion para mostrar todos las categorias habilitadas
    @Query("select p from Producto p where p.estado='1'") 
    List<Producto> findAllCustom();
}
