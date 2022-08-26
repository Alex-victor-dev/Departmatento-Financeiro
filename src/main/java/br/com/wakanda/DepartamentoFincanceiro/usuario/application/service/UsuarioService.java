package br.com.wakanda.DepartamentoFincanceiro.usuario.application.service;

import br.com.wakanda.DepartamentoFincanceiro.usuario.application.api.UsuarioRequest;
import br.com.wakanda.DepartamentoFincanceiro.usuario.application.api.UsuarioResponse;

public interface UsuarioService {

	UsuarioResponse usuarioCriado(UsuarioRequest usuarioRequest);

}
