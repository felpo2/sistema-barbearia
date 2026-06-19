package com.barbearia.shop.service;

import com.barbearia.shop.model.Servico;
import com.barbearia.shop.repository.ServicoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoService {

    @Autowired
    private ServicoRepository servicoRepository;

    public Servico createServico(Servico servico) {


        return servicoRepository.save(servico);
    }

    public Servico buscarPorId(Long id) {
        return servicoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Serviço não encontrado com o ID: " + id));
    }

    public List<Servico> listarTodos() {
        return servicoRepository.findAll();
    }

    //Deletar
    public Servico deleteServico(Servico servico){

        return servicoRepository.deleteById(servico);
    }

    //Atualizar
    public Servico updateServico(Servico servico){

        return servicoRepository.save(servico);
    }
}