package br.com.wakanda.DepartamentoFincanceiro.usuario.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.wakanda.DepartamentoFincanceiro.usuario.application.api.UsuarioAlteradoRequest;
import br.com.wakanda.DepartamentoFincanceiro.usuario.application.api.UsuarioRequest;
import br.com.wakanda.DepartamentoFincanceiro.usuario.application.api.UsuarioResponse;
import br.com.wakanda.DepartamentoFincanceiro.usuario.application.api.UsuariosListResponse;
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

	@Override
	public void patchAlteraUsuario(UUID idUsuario, @Valid UsuarioAlteradoRequest usuarioAlteradoRequest) {
		log.info("[inicia] UsuarioApplicationService  - patchAlteraUsuario");
		log.info("[idUsuario] {}", idUsuario);
		Usuario usuario = usuarioRepository.buscaUsuarioPorId(idUsuario);
		usuario.patchAlteraUsuari(usuarioAlteradoRequest);
		usuarioRepository.salva(usuario);
		log.info("[finaliza] UsuarioApplicationService  - patchAlteraUsuario");

	}

	@Override
	public List<UsuariosListResponse> listaTodosUsuarios() {
		log.info("[inicia] UsuarioApplicationService  - listaTodosUsuarios");
		List<Usuario> usuarios = usuarioRepository.buscaTodosUsuarioRepository();
		log.info("[finaliza] UsuarioApplicationService  - listaTodosUsuarios");
		return UsuariosListResponse.converte(usuarios);
	}

	@Override
	public void deletaUsuarioPorId(UUID idUsuario) {
		log.info("[inicia] UsuarioApplicationService  - deletaUsuarioPorId");
		log.info("[idUsuario] {}", idUsuario);
		usuarioRepository.buscaUsuarioPorId(idUsuario);
		usuarioRepository.deletaUsuarioPorId(idUsuario);
		log.info("[finaliza] UsuarioApplicationService  - deletaUsuarioPorId");
		
		
		
	}
}
