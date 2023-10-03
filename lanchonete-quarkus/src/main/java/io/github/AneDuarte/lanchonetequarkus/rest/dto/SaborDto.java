package io.github.AneDuarte.lanchonetequarkus.rest.dto;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class SaborDto {
    @NotBlank(message = "Campo obrigatório!")
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
