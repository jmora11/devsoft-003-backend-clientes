package com.devsoft.springboot.backend.apirest.services;

import com.devsoft.springboot.backend.apirest.entity.Cliente;
import com.devsoft.springboot.backend.apirest.entity.Region;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IClienteService {

    public List<Cliente> findAll();

    public Page<Cliente> findAll(Pageable pageable);

    public Cliente findById(Long id);

    public Cliente save(Cliente cliente);

    public void delete(Long id);

    public List<Region> findAllRegiones();

}
