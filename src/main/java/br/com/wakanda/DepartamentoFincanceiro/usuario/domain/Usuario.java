package br.com.wakanda.DepartamentoFincanceiro.usuario.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class Usuario {
	@NotBlank
	private String nomeCompleto;
	@CPF
	private String cpf;
	@NotBlank
	private String telefone;
	@NotBlank
	@Email
	private String email;
	private Sexo sexo;
	@NotNull
	private LocalDate dataNascimento;
	private LocalDateTime dataHoraDoCadastro;

}
