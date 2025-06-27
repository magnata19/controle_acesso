package io.github.magnata19.controle_acesso.adapter.repositories;

import io.github.magnata19.controle_acesso.adapter.entitites.UsuarioEntity;
import io.github.magnata19.controle_acesso.core.domain.Usuario;
import io.github.magnata19.controle_acesso.core.ports.UsuarioRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UsuarioRepositoryAdapter implements UsuarioRepositoryPort {

  private final UsuarioRepository usuarioRepository;
  private final ModelMapper modelMapper;
  @Override
  public Usuario create(Usuario usuario) {
    return modelMapper.map(
        usuarioRepository.save(modelMapper.map(usuario, UsuarioEntity.class)),
            Usuario.class);
  }
}
