package io.github.AneDuarte.lanchonetequarkus.domain.repository;

import io.github.AneDuarte.lanchonetequarkus.domain.model.Sabor;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SaborRepository implements PanacheRepository<Sabor> {
    public Sabor encontrarPorNome(String nome) {
        return find("nome = ?1 ", nome).firstResult();
    }
}
