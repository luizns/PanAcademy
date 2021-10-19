package com.luizns.appspringcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import com.luizns.appspringcrud.model.TarefasModel;

public interface TarefasRepository extends JpaRepository<TarefasModel, Long> {
    public List<TarefasModel> findAllByTarefaContainingIgnoreCase(String tarefa);

    public List<TarefasModel> findByTarefaAndId(String tarefa, Long id);

    public List<TarefasModel> findByTarefaOrId(String tarefa, Long id);

    @Query(value = "SELECT * FROM TAREFA_MODEL", nativeQuery = true)
    List<TarefasModel> procuraTodos();


}
