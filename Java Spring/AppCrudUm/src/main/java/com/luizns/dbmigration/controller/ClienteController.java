package com.luizns.dbmigration.controller;

import java.util.List;

import com.luizns.dbmigration.model.ClienteModel;
import com.luizns.dbmigration.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping("/listar/clientes")
	public List<ClienteModel> findAll(){
		return clienteRepository.findAll();
	}
	
	@PostMapping("/salvar/clientes")
	ResponseEntity<ClienteModel> post(@RequestBody ClienteModel cliente){
		return ResponseEntity.status(HttpStatus.CREATED).body(clienteRepository.save(cliente));
	}
	
	@GetMapping("listar/pessoas/{tipo}")
	public ResponseEntity<List<ClienteModel>> filtroId(@PathVariable Integer tipo){
		return ResponseEntity.ok(clienteRepository.procuraTipoPessoa(tipo));
	}

	@GetMapping("listar/clientes/sql")
	public List<ClienteModel> procuraTodos(){
		return clienteRepository.procuraTodos();
	}

	@GetMapping("/listar/clientes/sql/alfabetico")
	public List<ClienteModel> procuraTodosAlfabetico(){
		return clienteRepository.procuraTodosAlfabetico();
	}

}
