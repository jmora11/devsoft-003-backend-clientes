package com.devsoft.springboot.backend.apirest.dao;

import com.devsoft.springboot.backend.apirest.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDAO extends CrudRepository<Cliente, Long> {
}
