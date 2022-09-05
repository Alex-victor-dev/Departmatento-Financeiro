package br.com.wakanda.DepartamentoFincanceiro.usuario.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

import br.com.wakanda.DepartamentoFincanceiro.usuario.application.api.UsuarioAlteradoRequest;
import br.com.wakanda.DepartamentoFincanceiro.usuario.application.api.UsuarioRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "UUID", name = "idUsuario", updatable = false, unique = true, nullable = false)
	private UUID idUsusario;

	@NotBlank
	private String nomeCompleto;
	@CPF
	@Column(unique = true)
	private String cpf;
	@NotBlank
	private String telefone;
	@NotBlank
	@Email
	@Column(unique = true)
	private String email;
	private Sexo sexo;
	@NotNull
	private LocalDate dataNascimento;
	private Boolean aceitaTermos = true;

	private LocalDateTime dataHoraDoCadastro;

	public Usuario(UsuarioRequest usuarioRequest) {
		this.nomeCompleto = usuarioRequest.getNomeCompleto();
		this.cpf = usuarioRequest.getCpf();
		this.telefone = usuarioRequest.getTelefone();
		this.email = usuarioRequest.getEmail();
		this.dataNascimento = usuarioRequest.getDataNascimento();
		this.dataHoraDoCadastro = LocalDateTime.now();
		this.aceitaTermos = usuarioRequest.getAceitaTermos();
	}

	public void patchAlteraUsuari(@Valid UsuarioAlteradoRequest usuarioAlteradoRequest) {
		this.telefone = usuarioAlteradoRequest.getTelefone();
		this.email = usuarioAlteradoRequest.getEmail();

	}

}
