package com.desafio.api.Model;

public class ClassificacaoResponse {

    private String texto;
    private String categoria;

    public ClassificacaoResponse(String texto, String categoria) {
        this.texto = texto;
        this.categoria = categoria;
    }

    public String getTexto() {
        return texto;
    }

    public String getCategoria() {
        return categoria;
    }
}
