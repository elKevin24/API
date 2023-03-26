package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import java.util.Objects;

@Entity
@Table(name = "barbero")
@ToString
public class barbero {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Getter
        @Setter
        @Column(name = "barbero_Id")
        private Long barberoId;
        @Getter @Setter @Column(name = "nombre")
        private String nombre;
        @Getter @Setter @Column(name = "apellido")
        private String apellido;
        @Getter @Setter @Column(name = "correo")
        private String correo;
        @Getter @Setter @Column(name = "barberia_Id")
        private String barberiaId;


        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
                barbero barbero = (barbero) o;
                return getBarberoId() != null && Objects.equals(getBarberoId(), barbero.getBarberoId());
        }

        @Override
        public int hashCode() {
                return getClass().hashCode();
        }
}
