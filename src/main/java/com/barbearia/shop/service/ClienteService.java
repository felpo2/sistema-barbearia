package com.barbearia.shop.service;

import com.barbearia.shop.model.Cliente;
import com.barbearia.shop.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    //Criar
    public Cliente createCliente(Cliente cliente) {

        return clienteRepository.save(cliente);
    }

    //Deletar
    public Cliente deleteCliente(Cliente cliente){
        
        return clienteRepository.deleteById(cliente);
    }

    //Atualizar
    public Cliente updateCliente(Cliente cliente){

        return clienteRepository.save(cliente);
    }
}
