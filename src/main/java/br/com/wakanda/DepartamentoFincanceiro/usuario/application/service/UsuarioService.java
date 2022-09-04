package br.com.wakanda.DepartamentoFincanceiro.usuario.application.service;

import java.util.UUID;

import javax.validation.Valid;

import br.com.wakanda.DepartamentoFincanceiro.usuario.application.api.UsuarioAlteradoRequest;
import br.com.wakanda.DepartamentoFincanceiro.usuario.application.api.UsuarioRequest;
import br.com.wakanda.DepartamentoFincanceiro.usuario.application.api.UsuarioResponse;

public interface UsuarioService {

	UsuarioResponse usuarioCriado(UsuarioRequest usuarioRequest);

	void patchAlteraUsuario(UUID idUsuario, @Valid UsuarioAlteradoRequest usuarioAlteradoRequest);


}
