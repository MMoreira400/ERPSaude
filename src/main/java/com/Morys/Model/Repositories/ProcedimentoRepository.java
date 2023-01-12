package com.Morys.Model.Repositories;

import com.Morys.Model.Entities.Procedimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcedimentoRepository extends JpaRepository<Procedimento,Long> {
}
