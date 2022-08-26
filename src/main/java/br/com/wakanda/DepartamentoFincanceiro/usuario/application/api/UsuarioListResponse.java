package br.com.wakanda.DepartamentoFincanceiro.usuario.application.api;

import java.time.LocalDate;
import java.util.UUID;

import br.com.wakanda.DepartamentoFincanceiro.usuario.domain.Sexo;
import lombok.Value;
@Value
public class UsuarioListResponse {
	private UUID idUsuario;
	private String nomeCompleto;
	private String cpf;
	private String telefone;
	private String email;
	private Sexo sexo;
	private LocalDate dataNascimento;
}
