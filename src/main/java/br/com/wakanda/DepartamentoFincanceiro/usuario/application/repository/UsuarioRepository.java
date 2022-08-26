package br.com.wakanda.DepartamentoFincanceiro.usuario.application.repository;

import org.springframework.stereotype.Repository;

import br.com.wakanda.DepartamentoFincanceiro.usuario.domain.Usuario;
@Repository
public interface UsuarioRepository {

	Usuario salva(Usuario usuario);

	

}
