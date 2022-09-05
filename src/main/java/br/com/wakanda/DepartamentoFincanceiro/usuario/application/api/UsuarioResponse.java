package br.com.wakanda.DepartamentoFincanceiro.usuario.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class UsuarioResponse {
	private UUID idUsuario;
}
