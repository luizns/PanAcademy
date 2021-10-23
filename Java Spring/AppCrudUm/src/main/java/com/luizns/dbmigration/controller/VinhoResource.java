package com.luizns.dbmigration.controller;

import com.luizns.dbmigration.model.Vinho;
import com.luizns.dbmigration.repository.VinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/vinhos")
public class VinhoResource {

    @Autowired
    private VinhoRepository vinhoRepository;

    @GetMapping
    public ResponseEntity<List<Vinho>> listar(){
        return ResponseEntity.ok().body(vinhoRepository.findAll());
    }
}
