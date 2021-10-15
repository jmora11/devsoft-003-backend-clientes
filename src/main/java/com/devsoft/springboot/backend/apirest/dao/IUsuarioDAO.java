package com.devsoft.springboot.backend.apirest.dao;

import com.devsoft.springboot.backend.apirest.entity.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioDAO extends CrudRepository<Usuario, Long> {

    @Query("select u from Usuario u where u.username = ?1")
    public Usuario findUser(String username);
}
