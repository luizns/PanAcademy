package com.luizns.appspringcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.luizns.appspringcrud.model.Vinho;
import com.luizns.appspringcrud.repository.VinhoRepository;

@RestController
@RequestMapping("/vinhos")
public class VinhosResource {

    @Autowired
    private VinhoRepository repository;

    @GetMapping
    public ResponseEntity<List<Vinho>> listar() {
        return ResponseEntity.ok().body(repository.findAll());
    }

//    @PostMapping
//    public ResponseEntity<Vinho> create(@RequestBody Vinho vinho) {
//
//    }
}
