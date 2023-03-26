package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;


import java.util.Objects;

@Entity
@Table(name = "horario")
@ToString
public class horario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    @Column(name = "horario_Id")
    private Long horario_Id;
    @Getter @Setter @Column(name = "dia_Semana")
    private String dia_Semana;
    @Getter @Setter @Column(name = "hora_Inicio")
    private String hora_Inicio;
    @Getter @Setter @Column(name = "hora_Fin")
    private String hora_Fin;
    @Getter @Setter @Column(name = "barbero_Id")
    private Long barbero_Id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        horario horario = (horario) o;
        return getHorario_Id() != null && Objects.equals(getHorario_Id(), horario.getHorario_Id());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
