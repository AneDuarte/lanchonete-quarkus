//package io.github.AneDuarte.lanchonetequarkus.domain.model;
//
//import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
//import io.quarkus.runtime.annotations.CommandLineArguments;
//import jakarta.persistence.*;
//import lombok.Data;
//
//@Entity
//@Table(name = "lanche")
//@Data
//public class Lanche extends PanacheEntityBase {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//    @Column(name = "nome")
//    private String nome;
//    @OneToOne
//    @JoinColumn(name = "id_sabor")
//    private int idSabor;
//}
