package io.github.AneDuarte.lanchonetequarkus.domain.util;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class Utils {

    public boolean camposObrigatorios(String bairro, String cep) {
        if (bairro == null || cep == null) return true;
        return false;
    }

    public boolean validacao(String bairro, String cep) {
        if(bairro.matches("^[a-zA-ZÀ-ÿ\\- ]+$") && cep.matches("[0-9]{8}")) return false;
        return true;
    }
}
