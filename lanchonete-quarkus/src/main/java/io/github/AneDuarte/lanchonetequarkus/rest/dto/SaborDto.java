package io.github.AneDuarte.lanchonetequarkus.rest.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class SaborDto {
    @NotBlank(message = "Campo obrigatório!")
    private String nome;
}
