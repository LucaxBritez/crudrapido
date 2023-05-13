package com.example.crudrapido.entity;

import jakarta.persistence.*;
import lombok.Data;

//Con @Data estoy utilizando la libreria pom.xml de lombook, con esto puedo ahorrarme el tener que escribir los set y los get
//solo debo definir los parametros.
@Data
//La anotación @Entity especifica que la clase es una entidad y está asignada a una tabla de base de datos.
@Entity
//La anotación @Table especifica el nombre de la tabla de la base de datos que se usará para la asignación.
@Table(name = "tbl_student")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String firstName;
    private String lastName;

    @Column(name = "email_address",unique = true)
    private String email;



}
