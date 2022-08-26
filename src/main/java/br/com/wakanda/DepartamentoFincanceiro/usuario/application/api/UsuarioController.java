package br.com.wakanda.DepartamentoFincanceiro.usuario.application.api;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import br.com.wakanda.DepartamentoFincanceiro.usuario.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class UsuarioController implements UsuarioAPI {

	private final ClienteService clienteService;

	@Override
	public UsuarioResponse postAdicionaNovoUsuario(UsuarioRequest usuarioRequest) {
		log.info("[inicia] UsuarioController - postAdicionaNovoUsuario ");
		UsuarioResponse usuarioNovo = clienteService.usuarioCriado(usuarioRequest);
		log.info("[finaliza] UsuarioController - postAdicionaNovoUsuario ");
		return usuarioNovo;
	}

	@Override
	public List<UsuarioResponse> getTodosPorUsuarios(UsuarioRequest usuarioRequest) {
		log.info("[inicia] UsuarioController - getTodosPorUsuarios ");
		log.info("[finaliza] UsuarioController - getTodosPorUsuarios ");
		return null;
	}

}
