package com.example.demo.controller;

import com.example.demo.dao.HorarioDao;
import com.example.demo.models.horario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class HorarioController {

    private final HorarioDao horarioDao;

    public HorarioController(HorarioDao horarioDao) {
        this.horarioDao = horarioDao;
    }


    @RequestMapping(value = "horarios")
    public List<horario> getHorarios(){
        return horarioDao.getHorarios();
    }
}
