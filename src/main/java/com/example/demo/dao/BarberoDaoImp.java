package com.example.demo.dao;

import com.example.demo.models.barbero;
import com.example.demo.models.cita;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class BarberoDaoImp implements BarberoDao{

    @PersistenceContext
    EntityManager entityManager;


    @Override
    public List<barbero> getBarberos() {
        String sql = "FROM barbero ";
        return entityManager.createQuery(sql).getResultList();
    }
}
