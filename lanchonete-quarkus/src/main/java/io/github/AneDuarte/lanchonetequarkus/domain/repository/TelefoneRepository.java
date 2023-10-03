package io.github.AneDuarte.lanchonetequarkus.domain.repository;

import io.github.AneDuarte.lanchonetequarkus.domain.model.Telefone;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TelefoneRepository implements PanacheRepository<Telefone> {
    public boolean validacao(String ddd, String numero) {
        if (ddd.matches("[0-9]{2}") && numero.matches("[0-9]{8}|[0-9]{9}")) return true;
        return false;
    }
}
