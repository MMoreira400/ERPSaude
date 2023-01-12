package com.Morys.Model.Repositories;

import com.Morys.Model.Entities.Prestador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrestadorRepository extends JpaRepository<Prestador,Long> {
}
