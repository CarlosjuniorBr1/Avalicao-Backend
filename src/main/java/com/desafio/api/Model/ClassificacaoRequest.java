package com.desafio.api.Model;
import jakarta.validation.constraints.NotBlank;


public class ClassificacaoRequest {

    @NotBlank(message="O texto não pode ser vázio!")
    private String texto;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
