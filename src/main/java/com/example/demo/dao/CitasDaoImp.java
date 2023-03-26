package com.example.demo.dao;

import com.example.demo.models.cita;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class CitasDaoImp implements CitasDao{
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public List<cita> getCitas() {

        String sql = "FROM cita";
        return entityManager.createQuery(sql).getResultList();

    }
}
