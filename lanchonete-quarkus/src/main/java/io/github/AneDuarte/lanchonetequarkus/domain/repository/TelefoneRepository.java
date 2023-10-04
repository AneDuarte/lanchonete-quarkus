package io.github.AneDuarte.lanchonetequarkus.domain.repository;

import io.github.AneDuarte.lanchonetequarkus.domain.model.Telefone;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TelefoneRepository implements PanacheRepository<Telefone> {

}
