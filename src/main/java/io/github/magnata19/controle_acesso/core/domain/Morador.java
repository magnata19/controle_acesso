package io.github.magnata19.controle_acesso.core.domain;

public class Morador {

    private Long id;
    private String cpf;
    private String endereco;
    private String celular;
    private Long idPessoa;

    public Morador() {
    }

    public Morador(Long id, String cpf, String endereco, String celular, Long idPessoa) {
        this.id = id;
        this.cpf = cpf;
        this.endereco = endereco;
        this.celular = celular;
        this.idPessoa = idPessoa;
    }

    public Long getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCelular() {
        return celular;
    }

    public Long getIdPessoa() {
        return idPessoa;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }
}
