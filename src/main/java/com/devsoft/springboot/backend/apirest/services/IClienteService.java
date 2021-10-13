package com.devsoft.springboot.backend.apirest.services;

import com.devsoft.springboot.backend.apirest.entity.Cliente;

import java.util.List;

public interface IClienteService {

    public List<Cliente> findAll();

    public Cliente findById(Long id);

    public Cliente save(Cliente cliente);

    public void delete(Long id);
}
