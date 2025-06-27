package io.github.magnata19.controle_acesso.adapter.dtos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDto {
  private Long id;
  private String nome;
  private String email;
  private String senha;
  private Boolean admin;
}
