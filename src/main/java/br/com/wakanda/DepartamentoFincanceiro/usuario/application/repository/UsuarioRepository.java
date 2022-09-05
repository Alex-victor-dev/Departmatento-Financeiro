package br.com.wakanda.DepartamentoFincanceiro.usuario.application.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;
import br.com.wakanda.DepartamentoFincanceiro.usuario.domain.Usuario;
@Repository
public interface UsuarioRepository {

	Usuario salva(Usuario usuario);

	List<Usuario> buscaTodosUsuarioRepository();

	Usuario buscaUsuarioPorId(UUID idUsuario);

	void deletaUsuarioPorId(UUID idUsuario);

}
