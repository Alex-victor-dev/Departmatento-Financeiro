package br.com.wakanda.DepartamentoFincanceiro.usuario.application.repository;

import java.util.UUID;

import org.springframework.stereotype.Repository;

import br.com.wakanda.DepartamentoFincanceiro.usuario.domain.Usuario;
@Repository
public interface UsuarioRepository {

	Usuario salva(Usuario usuario);

//	Usuario buscaUsuarioPorId(UUID idUsuario);


	

}
