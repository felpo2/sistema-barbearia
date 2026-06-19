package com.barbearia.shop.repository;

import com.barbearia.shop.model.Servico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoRepository extends JpaRepository <Servico, Long>{
    Servico deleteById(Servico servico);
}
