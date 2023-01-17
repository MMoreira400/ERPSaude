package com.Morys.Model.Repositories;

import com.Morys.Model.Entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {

    Cliente findByCodigo(Integer codigo);
}
