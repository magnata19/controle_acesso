package io.github.magnata19.controle_acesso.core.ports;

import io.github.magnata19.controle_acesso.core.domain.Usuario;

public interface UsuarioRepositoryPort {
  Usuario create(Usuario usuario);
}
