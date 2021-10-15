package com.devsoft.springboot.backend.apirest.services;

import com.devsoft.springboot.backend.apirest.entity.Usuario;

public interface IUsuarioService {

    public Usuario findUser(String username);

}
