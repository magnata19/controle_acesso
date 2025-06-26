package io.github.magnata19.controle_acesso.core.domain;

public class Visitante {
    private Long id;
    private String rg;
    private Long idPessoa;

    public Visitante() {
    }

    public Visitante(Long id, String rg, Long idPessoa) {
        this.id = id;
        this.rg = rg;
        this.idPessoa = idPessoa;
    }

    public Long getId() {
        return id;
    }

    public String getRg() {
        return rg;
    }

    public Long getIdPessoa() {
        return idPessoa;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }
}
