package br.com.wakanda.DepartamentoFincanceiro.usuario.service;

import br.com.wakanda.DepartamentoFincanceiro.usuario.application.api.UsuarioRequest;
import br.com.wakanda.DepartamentoFincanceiro.usuario.application.api.UsuarioResponse;

public interface ClienteService {

	UsuarioResponse usuarioCriado(UsuarioRequest usuarioRequest);

}
