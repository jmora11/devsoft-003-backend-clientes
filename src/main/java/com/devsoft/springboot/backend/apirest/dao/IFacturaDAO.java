package com.devsoft.springboot.backend.apirest.dao;

import com.devsoft.springboot.backend.apirest.entity.Factura;
import org.springframework.data.repository.CrudRepository;

public interface IFacturaDAO extends CrudRepository<Factura, Long> {
}
