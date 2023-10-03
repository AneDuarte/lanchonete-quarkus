package io.github.AneDuarte.lanchonetequarkus.rest;

import io.github.AneDuarte.lanchonetequarkus.domain.model.Sabor;
import io.github.AneDuarte.lanchonetequarkus.domain.repository.SaborRepository;
import io.github.AneDuarte.lanchonetequarkus.rest.dto.SaborDto;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/sabor")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class SaborResource {

    private SaborRepository saborRepository;

    @Inject
    public SaborResource(SaborRepository saborRepository) {
        this.saborRepository = saborRepository;
    }

    @POST
    @Transactional
    public Response criarSabor(SaborDto saborDto) {
        //conferir se ja existe sabor no banco

        Sabor sabor = new Sabor();
        sabor.setNome(saborDto.getNome());
        saborRepository.persist(sabor);

        return Response.status(Response.Status.CREATED).entity(sabor).build();
    }

    @GET
    public Response listarSabores() {
        PanacheQuery<Sabor> listagem = Sabor.findAll();
        return Response.ok(listagem.list()).build();
    }

}
