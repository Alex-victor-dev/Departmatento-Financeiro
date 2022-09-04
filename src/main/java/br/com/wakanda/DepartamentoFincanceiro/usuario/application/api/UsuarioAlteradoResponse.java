package br.com.wakanda.DepartamentoFincanceiro.usuario.application.api;

import javax.validation.constraints.NotBlank;

import lombok.Value;

@Value
public class UsuarioAlteradoResponse {

	private String telefone;
	@NotBlank
	private String email;
}
