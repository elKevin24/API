package com.example.demo.dao;

import com.example.demo.models.horario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class HorarioDaoImp implements HorarioDao{
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<horario> getHorarios(){
        String sql = "FROM horario";
        return entityManager.createQuery(sql).getResultList();

    }
}
