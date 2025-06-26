package io.github.magnata19.controle_acesso.core.domain;

import java.time.LocalDateTime;

public class Visita {

    private Long id;
    private LocalDateTime dataHora;
    private Long idMorador;
    private Long idVisita;

    public Visita() {
    }

    public Visita(Long id, LocalDateTime dataHora, Long idMorador, Long idVisita) {
        this.id = id;
        this.dataHora = dataHora;
        this.idMorador = idMorador;
        this.idVisita = idVisita;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public Long getIdMorador() {
        return idMorador;
    }

    public Long getIdVisita() {
        return idVisita;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public void setIdMorador(Long idMorador) {
        this.idMorador = idMorador;
    }

    public void setIdVisita(Long idVisita) {
        this.idVisita = idVisita;
    }
}
