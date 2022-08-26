package br.com.wakanda.DepartamentoFincanceiro.usuario.application.api;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class UsuarioController implements UsuarioAPI {

	@Override
	public UsuarioResponse postAdicionaNovoUsuario(UsuarioRequest usuarioRequest) {
		log.info("[inicia] UsuarioController - postAdicionaNovoUsuario ");
		log.info("[finaliza] UsuarioController - postAdicionaNovoUsuario ");
		return null;
	}

}
