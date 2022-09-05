package br.com.wakanda.DepartamentoFincanceiro.usuario.application.api;

import java.util.List;
import java.util.stream.Collectors;

import br.com.wakanda.DepartamentoFincanceiro.usuario.domain.Usuario;
import lombok.Value;

@Value
public class UsuariosListResponse {

	private String nomeCompleto;
	private String cpf;
	private String email;

	public static List<UsuariosListResponse> converte(List<Usuario> usuarios) {
		return usuarios.stream().map(UsuariosListResponse::new).collect(Collectors.toList());
	}

	public UsuariosListResponse(Usuario usuarios) {
		super();
		this.nomeCompleto = usuarios.getNomeCompleto();
		this.cpf = usuarios.getCpf();
		this.email = usuarios.getEmail();

	}

}
