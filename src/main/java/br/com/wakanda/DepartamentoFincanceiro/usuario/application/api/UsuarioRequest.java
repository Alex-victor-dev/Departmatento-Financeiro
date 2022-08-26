package br.com.wakanda.DepartamentoFincanceiro.usuario.application.api;

import java.time.LocalDate;

import br.com.wakanda.DepartamentoFincanceiro.usuario.domain.Sexo;
import lombok.Getter;
import lombok.Value;

@Value
public class UsuarioRequest {
	private String nomeCompleto;
	private String cpf;
	private String telefone;
	private String email;
	private Sexo sexo;
	private LocalDate dataNascimento;
	
}
