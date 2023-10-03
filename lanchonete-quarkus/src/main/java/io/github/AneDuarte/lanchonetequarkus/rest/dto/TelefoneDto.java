package io.github.AneDuarte.lanchonetequarkus.rest.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class TelefoneDto {
    @NotBlank(message = "DDD é um campo obrigatório!")
    private String ddd;
    @NotBlank(message = "Número é um campo obrigatório")
    private String numero;
}
