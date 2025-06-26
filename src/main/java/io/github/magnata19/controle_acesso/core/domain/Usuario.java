package io.github.magnata19.controle_acesso.core.domain;


public class Usuario{
    private Long id;
    private String email;
    private String senha;
    private Boolean admin;
    private Long idPessoa;

    public Usuario() {
    }

    public Usuario(Long id, String email, String senha, Boolean admin, Long idPessoa) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.admin = admin;
        this.idPessoa = idPessoa;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public Long getIdPessoa() {
        return idPessoa;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }
}
