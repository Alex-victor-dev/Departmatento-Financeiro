package br.com.wakanda.DepartamentoFincanceiro.usuario.application.api;

import lombok.Value;

@Value
public class UsuarioAlteradoRequest {
	
	private String telefone;
	private String email;

}
