package br.com.luizns.microtabela.repositories;

import br.com.luizns.microtabela.model.Tabela;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TabelaRepository extends JpaRepository<Tabela, Long> {

}
