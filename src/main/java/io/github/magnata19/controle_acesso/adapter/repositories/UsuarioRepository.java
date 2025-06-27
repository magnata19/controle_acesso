package io.github.magnata19.controle_acesso.adapter.repositories;

import io.github.magnata19.controle_acesso.adapter.entitites.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
}
