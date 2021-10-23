package com.luizns.dbmigration.repository;

import java.util.List;

import com.luizns.dbmigration.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {

	@Query(value= "SELECT * FROM CLIENTE_MODEL u WHERE u.tipo = :tipo", nativeQuery = true)
	List<ClienteModel> procuraTipoPessoa(Integer tipo);

	@Query(value = "SELECT * FROM CLIENTE_MODEL c", nativeQuery = true)
	List<ClienteModel> procuraTodos();

	@Query(value= "SELECT * FROM CLIENTE_MODEL c ORDER BY c.nome", nativeQuery = true)
	List<ClienteModel> procuraTodosAlfabetico();

}
