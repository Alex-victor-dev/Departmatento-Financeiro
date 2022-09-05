package br.com.wakanda.DepartamentoFincanceiro.usuario.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.wakanda.DepartamentoFincanceiro.handler.APIException;
import br.com.wakanda.DepartamentoFincanceiro.usuario.application.repository.UsuarioRepository;
import br.com.wakanda.DepartamentoFincanceiro.usuario.domain.Usuario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class UsuarioInfraRepository implements UsuarioRepository {

	private final UsuarioSpringMongoDBRepository usuarioSpringMongoDBRepository;

	@Override
	public Usuario salva(Usuario usuario) {
		log.info("[inicia] UsuarioInfraRepository  - salva");
		Usuario usuarioSalvo = usuarioSpringMongoDBRepository.save(usuario);
		log.info("[finaliza] UsuarioInfraRepository  - salva");
		return usuarioSalvo;
	}

	@Override
	public List<Usuario> buscaTodosUsuarioRepository() {
		log.info("[inicia] UsuarioInfraRepository  - buscaTodosUsuarioRepository");
		List<Usuario> todosUsuarios = usuarioSpringMongoDBRepository.findAll();
		log.info("[finaliza] UsuarioInfraRepository  - buscaTodosUsuarioRepository");
		return todosUsuarios;
	}

	@Override
	public Usuario buscaUsuarioPorId(UUID idUsuario) {
		log.info("[inicia] UsuarioInfraRepository  - buscaUsuarioPorId");
		Usuario usuario = usuarioSpringMongoDBRepository.findById(idUsuario).orElseThrow(
				() -> APIException.build(HttpStatus.NOT_FOUND, "Id Do Usuario nao encontrado : " + idUsuario));
		log.info("[inicia] UsuarioInfraRepository  - buscaUsuarioPorId");
		return usuario;
	}

	@Override
	public void deletaUsuarioPorId(UUID idUsuario) {
		log.info("[inicia] UsuarioInfraRepository  - deletaUsuarioPorId");
		usuarioSpringMongoDBRepository.deleteById(idUsuario);
		log.info("[inicia] UsuarioInfraRepository  - deletaUsuarioPorId");
	}

}
