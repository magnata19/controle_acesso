package io.github.magnata19.controle_acesso.adapter.converters;

import io.github.magnata19.controle_acesso.adapter.dtos.UsuarioDto;
import io.github.magnata19.controle_acesso.core.domain.Usuario;
import org.springframework.stereotype.Component;

@Component
public class UsuarioConverter {

  public Usuario toDomain(UsuarioDto usuarioDto) {
    return new Usuario(
            usuarioDto.getId(),
            usuarioDto.getEmail(),
            usuarioDto.getSenha(),
            usuarioDto.getAdmin(), null);
  }

  public UsuarioDto toDto(Usuario usuario) {
    return new UsuarioDto(usuario.getId(),
            null,
            usuario.getEmail(),
            usuario.getSenha(),
            usuario.getAdmin());
  }
}
