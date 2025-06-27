package io.github.magnata19.controle_acesso.infra;

import io.github.magnata19.controle_acesso.core.ports.UsuarioRepositoryPort;
import io.github.magnata19.controle_acesso.core.ports.UsuarioServicePort;
import io.github.magnata19.controle_acesso.core.usecases.SalvarUsuarioUsecase;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

  @Bean
  SalvarUsuarioUsecase usuarioServicePortImpl(UsuarioRepositoryPort usuarioRepositoryPort){
    return new SalvarUsuarioUsecase(usuarioRepositoryPort);
  }

  @Bean
  ModelMapper modelMapper() {
    return new ModelMapper();
  }
}
