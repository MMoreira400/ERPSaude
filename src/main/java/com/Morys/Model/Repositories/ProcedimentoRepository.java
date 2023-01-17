package com.Morys.Model.Repositories;

import com.Morys.Model.Entities.Procedimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProcedimentoRepository extends JpaRepository<Procedimento,Long> {

    Procedimento findByCodigo(Integer codigo);

}
