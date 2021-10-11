package com.crud.appcrud.controller;

import com.crud.appcrud.model.MaintenanceModel;
import com.crud.appcrud.repository.MaintenanceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class MaintenanceController {

    @Autowired
    private MaintenanceRepo repository;

    @GetMapping
    public List<MaintenanceModel> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<MaintenanceModel> create(@RequestBody MaintenanceModel model) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(model));
    }

}
