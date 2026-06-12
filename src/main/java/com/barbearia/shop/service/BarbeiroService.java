package com.barbearia.shop.service;

import com.barbearia.shop.model.Barbeiro;
import com.barbearia.shop.model.Cliente;
import com.barbearia.shop.repository.BarbeiroRepository;
import com.barbearia.shop.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BarbeiroService {

    @Autowired
    private BarbeiroRepository barbeiroRepository;

    //Criar
    public Barbeiro createBarbeiro(Barbeiro barbeiro) {

        return barbeiroRepository.save(barbeiro);
    }

    //Deletar
    public Barbeiro deleteBarbeiro(Barbeiro barbeiro){

        return barbeiroRepository.deleteById(barbeiro);
    }

    //Atualizar
    public Barbeiro updateBarbeiro(Barbeiro barbeiro){

        return barbeiroRepository.save(barbeiro);
    }
}

