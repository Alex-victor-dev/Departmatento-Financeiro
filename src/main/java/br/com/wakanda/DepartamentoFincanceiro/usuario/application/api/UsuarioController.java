package br.com.wakanda.DepartamentoFincanceiro.usuario.application.api;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import br.com.wakanda.DepartamentoFincanceiro.usuario.application.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class UsuarioController implements UsuarioAPI {

	private final UsuarioService usuarioService;

	@Override
	public UsuarioResponse postAdicionaNovoUsuario(UsuarioRequest usuarioRequest) {
		log.info("[inicia] UsuarioController - postAdicionaNovoUsuario ");
		UsuarioResponse usuarioNovo = usuarioService.usuarioCriado(usuarioRequest);
		log.info("[finaliza] UsuarioController - postAdicionaNovoUsuario ");
		return usuarioNovo;
	}

	@Override
	public UsuarioAlteradoResponse alteraUsuarioPorId(UUID idCliente, @Valid UsuarioRequest usuarioRequest) {
		log.info("[inicia] UsuarioController - alteraUsuarioPorId");
		log.info("[inicia] UsuarioController - alteraUsuarioPorId");
		return null;
	}

}
