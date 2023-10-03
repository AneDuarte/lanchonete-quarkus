package io.github.AneDuarte.lanchonetequarkus.rest.dto;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class SaborDto {
    @NotBlank(message = "Campo obrigatório!")
    private String nome;
}
