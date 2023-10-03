//package io.github.AneDuarte.lanchonetequarkus.domain.model;
//
//import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
//import jakarta.persistence.*;
//import lombok.Data;
//
//@Entity
//@Table(name = "pedido")
//@Data
//public class Pedido extends PanacheEntityBase {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//    @ManyToOne
//    @JoinColumn(name = "id_usuario")
//    private int idUsuario;
//    @ManyToOne
//    @JoinColumn(name = "id_lanche")
//    private int idLanche;
//}
