package br.com.wakanda.DepartamentoFincanceiro.usuario.application.api;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.wakanda.DepartamentoFincanceiro.usuario.domain.Sexo;
import br.com.wakanda.DepartamentoFincanceiro.usuario.domain.Usuario;
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
	
	public static List<UsuarioListResponse> converte(List<Usuario> usuarios) {
		
		return usuarios.stream()
				.map(UsuarioListResponse:: new)
				.collect(Collectors.toList());
	}

	public UsuarioListResponse(Usuario usuario) {
		this.idUsuario = usuario.getIdUsusario();
		this.nomeCompleto = usuario.getNomeCompleto();
		this.cpf = usuario.getCpf();
		this.telefone = usuario.getTelefone();
		this.email = usuario.getEmail();
		this.sexo = usuario.getSexo();
		this.dataNascimento = usuario.getDataNascimento();
	}
}
