package com.example.demo.controller;

import com.example.demo.dao.BarberoDao;
import com.example.demo.models.barbero;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BarberoController {
    private final BarberoDao barberoDao;

    public BarberoController(BarberoDao barberoDao) {
        this.barberoDao = barberoDao;
    }
    @RequestMapping(value = "barbero")
    public List<barbero> getBarberos(){
        return barberoDao.getBarberos();
    }
}
