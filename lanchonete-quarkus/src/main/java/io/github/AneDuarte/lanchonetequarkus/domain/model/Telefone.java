package io.github.AneDuarte.lanchonetequarkus.domain.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "telefone")
@Data
public class Telefone extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "ddd")
    private String ddd;
    @Column(name = "numero")
    private String numero;
}
