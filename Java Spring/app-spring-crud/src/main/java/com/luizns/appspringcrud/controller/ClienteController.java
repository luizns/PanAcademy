package com.luizns.appspringcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.luizns.appspringcrud.model.ClienteModel;
import com.luizns.appspringcrud.repository.ClienteRepository;

@RestController
@RequestMapping(value = "/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/listar")
    public List<ClienteModel> findAll() {
        return clienteRepository.findAll();
    }

    @PostMapping("/salvar")
    ResponseEntity<ClienteModel> save(@RequestBody ClienteModel clientinho) {
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteRepository.save(clientinho));
    }

    @GetMapping("/listar/{tipo}")
    public ResponseEntity<List<ClienteModel>> filtroPorId(@PathVariable Integer tipo) {
        return ResponseEntity.ok(clienteRepository.procuraTipoPessoas(tipo));
    }
}
