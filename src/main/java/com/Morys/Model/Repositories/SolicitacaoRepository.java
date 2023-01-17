package com.Morys.Model.Repositories;

import com.Morys.Model.Entities.Solicitacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitacaoRepository extends JpaRepository<Solicitacao,Long> {

}
