package io.github.magnata19.controle_acesso.core.ports;

import io.github.magnata19.controle_acesso.core.domain.Usuario;

public interface UsuarioServicePort {
  Usuario createUsuario(Usuario usuario);
}
