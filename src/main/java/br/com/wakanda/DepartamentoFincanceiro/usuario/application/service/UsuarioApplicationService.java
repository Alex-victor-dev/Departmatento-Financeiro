package br.com.wakanda.DepartamentoFincanceiro.usuario.application.service;

import org.springframework.stereotype.Service;

import br.com.wakanda.DepartamentoFincanceiro.usuario.application.api.UsuarioRequest;
import br.com.wakanda.DepartamentoFincanceiro.usuario.application.api.UsuarioResponse;
import br.com.wakanda.DepartamentoFincanceiro.usuario.application.repository.UsuarioRepository;
import br.com.wakanda.DepartamentoFincanceiro.usuario.domain.Usuario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Service
@Log4j2
@RequiredArgsConstructor
public class UsuarioApplicationService implements UsuarioService {

	private final UsuarioRepository usuarioRepository;

	@Override
	public UsuarioResponse usuarioCriado(UsuarioRequest usuarioRequest) {
		log.info("[inicia] UsuarioApplicationService  - usuarioCriado");
		Usuario usuario = usuarioRepository.salva(new Usuario(usuarioRequest));
		log.info("[finaliza] UsuarioApplicationService  - usuarioCriado");
		return UsuarioResponse.builder().idUsuario(usuario.getIdUsusario()).build();
	}

}
