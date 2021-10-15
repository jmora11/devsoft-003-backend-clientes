package com.devsoft.springboot.backend.apirest.auth;

import com.devsoft.springboot.backend.apirest.entity.Usuario;
import com.devsoft.springboot.backend.apirest.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class InfoAdicionalToken implements TokenEnhancer {

    @Autowired
    IUsuarioService iUsuarioService;

    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken oAuth2AccessToken, OAuth2Authentication oAuth2Authentication) {

        Usuario usuario = iUsuarioService.findUser(oAuth2Authentication.getName());

        Map<String, Object> info = new HashMap<>();

        info.put("info adicional", "Hola quie tal: ".concat(oAuth2Authentication.getName()));
        info.put("nombre", usuario.getUsername());
        info.put("apellido", usuario.getApellido());
        info.put("email", usuario.getEmail());

        ((DefaultOAuth2AccessToken) oAuth2AccessToken).setAdditionalInformation(info);

        return oAuth2AccessToken;
    }
}
