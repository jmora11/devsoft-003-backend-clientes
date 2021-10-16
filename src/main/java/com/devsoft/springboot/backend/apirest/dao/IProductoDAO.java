package com.devsoft.springboot.backend.apirest.dao;

import com.devsoft.springboot.backend.apirest.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IProductoDAO extends CrudRepository<Producto, Long> {

    @Query("select p from Producto p where p.nombre like %?1%")
    public List<Producto> findByNombre(String nombre);

    // public List<Producto> findByNombreContainigIgnoreCase(String nombre);

}
