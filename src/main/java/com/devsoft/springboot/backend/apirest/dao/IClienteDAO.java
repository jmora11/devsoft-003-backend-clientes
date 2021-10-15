package com.devsoft.springboot.backend.apirest.dao;

import com.devsoft.springboot.backend.apirest.entity.Cliente;
import com.devsoft.springboot.backend.apirest.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IClienteDAO extends JpaRepository<Cliente, Long> {

    @Query("from Region")
    public List<Region> findAllRegiones();

}
