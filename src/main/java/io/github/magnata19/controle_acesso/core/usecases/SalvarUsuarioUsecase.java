package io.github.magnata19.controle_acesso.core.usecases;

import io.github.magnata19.controle_acesso.core.domain.Usuario;
import io.github.magnata19.controle_acesso.core.ports.UsuarioRepositoryPort;
import io.github.magnata19.controle_acesso.core.ports.UsuarioServicePort;

public class SalvarUsuarioUsecase implements UsuarioServicePort {

  private final UsuarioRepositoryPort usuarioRepositoryPort;

  public SalvarUsuarioUsecase(UsuarioRepositoryPort usuarioRepositoryPort) {
    this.usuarioRepositoryPort = usuarioRepositoryPort;
  }

  @Override
  public Usuario createUsuario(Usuario usuario) {
    return usuarioRepositoryPort.create(usuario);
  }
}
