//package io.github.AneDuarte.lanchonetequarkus.domain.model;
//
//import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
//import jakarta.persistence.*;
//import lombok.Data;
//
//@Entity
//@Table(name = "usuario")
//@Data
//public class Usuario extends PanacheEntityBase {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//    @Column(name = "nome")
//    private String nome;
//    @Column(name = "email")
//    private String email;
//    @OneToOne
//    @JoinColumn(name = "id_telefone")
//    private int idTelefone;
////    @OneToOne
////    @JoinColumn(name = "id_endereco")
////    private int idEndereco;
//}
