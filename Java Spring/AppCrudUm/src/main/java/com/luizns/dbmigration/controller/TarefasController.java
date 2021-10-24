package com.luizns.dbmigration.controller;


import java.util.Calendar;
import java.util.List;

import com.luizns.dbmigration.model.TarefasModel;
import com.luizns.dbmigration.repository.TarefasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TarefasController {
	
	Calendar c1 = Calendar.getInstance();
	int hora = c1.get(Calendar.HOUR_OF_DAY);

	@Autowired
	private TarefasRepository tarefasRepository;

	@GetMapping("/listar/tarefas")
	public List<TarefasModel> findAll() {
		return tarefasRepository.findAll();
	}
		
	@GetMapping("/listar/{id}")
	public ResponseEntity<TarefasModel> getById(@PathVariable Long id){
		return tarefasRepository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/listar/tarefa/{tarefa}")
	public ResponseEntity<List<TarefasModel>> getByTarefa(@PathVariable String tarefa){
		return ResponseEntity.ok(tarefasRepository.findAllByTarefaContainingIgnoreCase(tarefa));
	}

	@GetMapping(value = "/listar/tarefas/condicional")
	public ResponseEntity<List<TarefasModel>> getAll() {
		if (hora > 9 && hora < 17) {
			System.out.println("entrou, dentro do horario");
			return ResponseEntity.ok(tarefasRepository.findAll());
		} else {
			System.out.println("fora do horario");
			return ResponseEntity.noContent().build();
		}

	}

	@PostMapping("/salvar/tarefas")
	public ResponseEntity<TarefasModel> post(@RequestBody TarefasModel tarefinha) {
		return ResponseEntity.status(HttpStatus.CREATED).body(tarefasRepository.save(tarefinha));
	}
	
	@GetMapping("/listar/tarefa/{tarefa}/{id}")
	public ResponseEntity<List<TarefasModel>> getByTarefaAndId(@PathVariable String tarefa, @PathVariable Long id){
		return ResponseEntity.ok(tarefasRepository.findByTarefaAndId(tarefa, id));		
	}

	@PutMapping("/atualizar/tab/{id}")
	public TarefasModel atualizar (@PathVariable Long id, @RequestBody TarefasModel model){
		model.setId(id);
		tarefasRepository.save(model);
		return model;
	}

}