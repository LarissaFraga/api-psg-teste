package br.com.testepsg.repository;

import br.com.testepsg.model.TipoQuestao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoQuestaoRepository extends JpaRepository<TipoQuestao,Long> {
}
