package br.com.wakanda.DepartamentoFincanceiro.usuario.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wakanda.DepartamentoFincanceiro.usuario.domain.Usuario;

public interface UsuarioSpringMongoDBRepository extends JpaRepository<Usuario, UUID>{

}
