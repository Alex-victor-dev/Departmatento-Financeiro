package br.com.wakanda.DepartamentoFincanceiro.usuario.application.service;

import java.util.List;
import java.util.UUID;
import br.com.wakanda.DepartamentoFincanceiro.usuario.application.api.UsuarioAlteradoRequest;
import br.com.wakanda.DepartamentoFincanceiro.usuario.application.api.UsuarioRequest;
import br.com.wakanda.DepartamentoFincanceiro.usuario.application.api.UsuarioResponse;
import br.com.wakanda.DepartamentoFincanceiro.usuario.application.api.UsuariosListResponse;
import br.com.wakanda.DepartamentoFincanceiro.usuario.domain.Usuario;

public interface UsuarioService {

	UsuarioResponse usuarioCriado(UsuarioRequest usuarioRequest);

	void patchAlteraUsuario(UUID idUsuario, UsuarioAlteradoRequest usuarioAlteradoRequest);

	List<UsuariosListResponse> listaTodosUsuarios();

	void deletaUsuarioPorId(UUID idUsuario);

	Usuario buscaUsuarioPorId(UUID idUsuario);

}
