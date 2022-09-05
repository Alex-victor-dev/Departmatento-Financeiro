package br.com.wakanda.DepartamentoFincanceiro.usuario.application.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("/v1/usuario")
public interface UsuarioAPI {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	UsuarioResponse postAdicionaNovoUsuario(@RequestBody @Valid UsuarioRequest usuarioRequest);

	@PatchMapping(value = "/{idUsuario}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void patchAlteraUsuario(@PathVariable UUID idUsuario,
			@RequestBody @Valid UsuarioAlteradoRequest usuarioAlteradoRequest);

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	List<UsuariosListResponse> getVisualizaTodosUsuarios();
}
