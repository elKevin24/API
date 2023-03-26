package com.example.demo.controller;

import com.example.demo.dao.CitasDao;
import com.example.demo.models.cita;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CitaController {

    private final CitasDao citasDao;

    public CitaController(CitasDao citasDao) {
        this.citasDao = citasDao;
    }

    @RequestMapping(value = "citas")
    public List<cita> getCitas(){
        return citasDao.getCitas();
    }



}
