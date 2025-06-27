package io.github.magnata19.controle_acesso.adapter.controller;

import io.github.magnata19.controle_acesso.adapter.converters.UsuarioConverter;
import io.github.magnata19.controle_acesso.adapter.dtos.UsuarioDto;
import io.github.magnata19.controle_acesso.core.usecases.SalvarUsuarioUsecase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

  private final SalvarUsuarioUsecase salvarUsuarioUsecase;
  private final UsuarioConverter usuarioConverter;

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public UsuarioDto create(@RequestBody() UsuarioDto usuarioDto){
    return usuarioConverter.toDto
            (salvarUsuarioUsecase.createUsuario(usuarioConverter.toDomain(usuarioDto)));
  }
}
