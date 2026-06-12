package com.barbearia.shop.repository;

import com.barbearia.shop.model.Barbeiro;
import com.barbearia.shop.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarbeiroRepository extends JpaRepository<Barbeiro, Long> {

    Barbeiro deleteById(Barbeiro barbeiro);

}
