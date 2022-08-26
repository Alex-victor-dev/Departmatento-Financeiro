package br.com.wakanda.DepartamentoFincanceiro.usuario.application.service;

import java.util.List;

import br.com.wakanda.DepartamentoFincanceiro.usuario.application.api.UsuarioListResponse;
import br.com.wakanda.DepartamentoFincanceiro.usuario.application.api.UsuarioRequest;
import br.com.wakanda.DepartamentoFincanceiro.usuario.application.api.UsuarioResponse;

public interface UsuarioService {

	UsuarioResponse usuarioCriado(UsuarioRequest usuarioRequest);

	List<UsuarioListResponse> buscaTodosClientes();

}
