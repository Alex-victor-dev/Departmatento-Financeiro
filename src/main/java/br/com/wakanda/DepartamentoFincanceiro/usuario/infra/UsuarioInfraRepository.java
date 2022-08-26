package br.com.wakanda.DepartamentoFincanceiro.usuario.infra;

import java.util.List;

import org.springframework.stereotype.Repository;

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
		Usuario usuarioSalvo =usuarioSpringMongoDBRepository.save(usuario);
		log.info("[finaliza] UsuarioInfraRepository  - salva");		
		return usuarioSalvo;
	}

	@Override
	public List<Usuario> buscaTosdosClientes() {
		log.info("[inicia] UsuarioInfraRepository  - buscaTosdosClientes");		
		List<Usuario> todosClientes = usuarioSpringMongoDBRepository.findAll();
		log.info("[finaliza] UsuarioInfraRepository  - buscaTosdosClientes");		
		return todosClientes;
	}

}
