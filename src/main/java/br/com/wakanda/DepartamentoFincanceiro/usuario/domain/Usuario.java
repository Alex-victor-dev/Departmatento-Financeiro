package br.com.wakanda.DepartamentoFincanceiro.usuario.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

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
	@Column(name = "id", updatable = false, unique = true, nullable = false)
	private UUID idUsusario;
	
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
	
	public Usuario(UsuarioRequest usuarioRequest) {
		this.nomeCompleto = usuarioRequest.getNomeCompleto();
		this.cpf = usuarioRequest.getCpf();
		this.telefone = usuarioRequest.getTelefone();
		this.email = usuarioRequest.getEmail();
		this.sexo = usuarioRequest.getSexo();
		this.dataNascimento = usuarioRequest.getDataNascimento();
		this.dataHoraDoCadastro = LocalDateTime.now();
		}
	
}
