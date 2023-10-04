package io.github.AneDuarte.lanchonetequarkus.rest;

import io.github.AneDuarte.lanchonetequarkus.domain.model.Telefone;
import io.github.AneDuarte.lanchonetequarkus.domain.repository.TelefoneRepository;
import io.github.AneDuarte.lanchonetequarkus.domain.util.Utils;
import io.github.AneDuarte.lanchonetequarkus.rest.dto.TelefoneDto;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/telefone")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TelefoneResource {

    private TelefoneRepository telefoneRepository;
    private Utils utils;

    @Inject
    public TelefoneResource(Utils utils, TelefoneRepository telefoneRepository) {
        this.telefoneRepository = telefoneRepository;
        this.utils = utils;
    }

    @POST
    @Transactional
    public Response adicionarTelefone(TelefoneDto telefoneDto) {
        if (utils.camposObrigatorios(telefoneDto.getDdd()) || utils.camposObrigatorios(telefoneDto.getNumero())) {
            return Response
                    .status(Response.Status.BAD_REQUEST)
                    .entity("DDD e número são campos obrigatórios!")
                    .build();
        }

        if(utils.validacaoTelefone(telefoneDto.getDdd(), telefoneDto.getNumero()) == false) {
            return Response
                    .status(Response.Status.BAD_REQUEST)
                    .entity("Número de telefone inválido!")
                    .build();
        }

        Telefone telefone = new Telefone();
        telefone.setDdd(telefoneDto.getDdd());
        telefone.setNumero(telefoneDto.getNumero());
        telefoneRepository.persist(telefone);

        return Response.status(Response.Status.CREATED).build();
    }
}
