package io.github.AneDuarte.lanchonetequarkus.domain.repository;

import io.github.AneDuarte.lanchonetequarkus.domain.model.Endereco;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class EnderecoRepository implements PanacheRepository<Endereco> {

}
