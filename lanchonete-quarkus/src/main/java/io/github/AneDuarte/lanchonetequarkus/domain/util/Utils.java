package io.github.AneDuarte.lanchonetequarkus.domain.util;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class Utils {

    public boolean camposObrigatorios(String valor) {
        if (valor == null) return true;
        return false;
    }

    public boolean validacaoEndereco(String bairro, String cep) {
        if(bairro.matches("^[a-zA-ZÀ-ÿ\\- ]+$") && cep.matches("[0-9]{8}")) return false;
        return true;
    }

    public boolean validacaoTelefone(String ddd, String numero) {
        if (ddd.matches("[0-9]{2}") && numero.matches("[0-9]{8}|[0-9]{9}")) return true;
        return false;
    }
}
