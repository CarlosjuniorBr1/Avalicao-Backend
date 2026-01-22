package com.desafio.api.Service;

import org.springframework.stereotype.Service;

@Service
public class ClassificacaoService {

    public String classificar(String texto) {
        String textoLower = texto.toLowerCase();

        if (textoLower.contains("promoção") || textoLower.contains("ganhe") || textoLower.contains("clique")) {
            return "SPAM";
        }

        if (textoLower.contains("parabéns") || textoLower.contains("ótimo") || textoLower.contains("excelente")) {
            return "ELOGIO";
        }

        if (textoLower.contains("problema") || textoLower.contains("ruim") || textoLower.contains("péssimo")) {
            return "RECLAMACAO";
        }

        return "OUTROS";
    }
}
