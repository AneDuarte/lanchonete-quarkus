package io.github.AneDuarte.lanchonetequarkus.rest;

import io.github.AneDuarte.lanchonetequarkus.domain.model.Endereco;
import io.github.AneDuarte.lanchonetequarkus.domain.repository.EnderecoRepository;
import io.github.AneDuarte.lanchonetequarkus.domain.util.Utils;
import io.github.AneDuarte.lanchonetequarkus.rest.dto.EnderecoDto;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jdk.jshell.execution.Util;

@Path("/endereco")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EnderecoResource {

    private EnderecoRepository enderecoRepository;
    private Utils utils;

    @Inject
    public EnderecoResource(EnderecoRepository enderecoRepository, Utils utils) {
        this.utils = utils;
        this.enderecoRepository = enderecoRepository;
    }

    @POST
    @Transactional
    public Response adicionarEndereco(EnderecoDto enderecoDto) {
        if(utils.camposObrigatorios(enderecoDto.getBairro()) || utils.camposObrigatorios(enderecoDto.getCep())) {
            return Response
                    .status(Response.Status.BAD_REQUEST)
                    .entity("Bairro e CEP são campos obrigatórios!")
                    .build();
        }

        if (utils.validacaoEndereco(enderecoDto.getBairro(), enderecoDto.getCep())) {
            return Response
                    .status(Response.Status.BAD_REQUEST)
                    .entity("Bairro ou CEP inválidos!")
                    .build();
        }

        Endereco endereco = new Endereco();
        endereco.setRua(enderecoDto.getRua());
        endereco.setBairro(enderecoDto.getBairro());
        endereco.setNumero(enderecoDto.getNumero());
        endereco.setCep(enderecoDto.getCep());
        enderecoRepository.persist(endereco);

        return Response.status(Response.Status.CREATED).entity(endereco).build();
    }
}
