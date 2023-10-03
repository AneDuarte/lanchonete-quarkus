package io.github.AneDuarte.lanchonetequarkus.rest.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EnderecoDto {
    private String rua;
    @NotBlank(message = "Campo obrigatório!")
    private String bairro;
    private String numero;
    @NotBlank(message = "Campo obrigatório!")
    private String cep;
}
