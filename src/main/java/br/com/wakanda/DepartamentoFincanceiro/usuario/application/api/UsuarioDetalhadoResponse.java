package br.com.wakanda.DepartamentoFincanceiro.usuario.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.wakanda.DepartamentoFincanceiro.usuario.domain.Sexo;
import br.com.wakanda.DepartamentoFincanceiro.usuario.domain.Usuario;
import lombok.Value;

@Value
public class UsuarioDetalhadoResponse {

	private UUID idUsusario;
	private String nomeCompleto;
	private String cpf;
	private String telefone;
	private String email;
	private Sexo sexo;
	private LocalDate dataNascimento;
	private Boolean aceitaTermos = true;
	private LocalDateTime dataHoraDoCadastro;

	public UsuarioDetalhadoResponse(Usuario usuario) {
		this.idUsusario = usuario.getIdUsusario();
		this.nomeCompleto = usuario.getNomeCompleto();
		this.cpf = usuario.getCpf();
		this.telefone = usuario.getTelefone();
		this.email = usuario.getEmail();
		this.sexo = usuario.getSexo();
		this.dataNascimento = usuario.getDataNascimento();
		this.dataHoraDoCadastro = usuario.getDataHoraDoCadastro();

	}

}
