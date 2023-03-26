package com.example.demo.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "cita")
@ToString @EqualsAndHashCode
public class cita {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter @Column(name = "cita_id")
    private Long cita_id;
    @Getter @Setter @Column(name = "fecha")
    private String fecha;
    @Getter @Setter @Column(name = "hora")
    private String hora;
    @Getter @Setter @Column(name = "cliente_Id")
    private Long clienteId;
    @Getter @Setter @Column(name = "barbero_Id")
    private Long barberoId;


}
