package br.com.wakanda.DepartamentoFincanceiro.usuario.application.api;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;

import br.com.wakanda.DepartamentoFincanceiro.usuario.domain.Sexo;
import lombok.Value;

@Value
public class UsuarioRequest {
	@NotBlank
	private String nomeCompleto;
	private String cpf;
	private String telefone;
	@NotBlank
	private String email;
	private Sexo sexo;
	private LocalDate dataNascimento;
	private Boolean aceitaTermos;

	
}
