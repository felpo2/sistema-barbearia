package com.barbearia.shop.service;

import com.barbearia.shop.model.Agendamento;
import com.barbearia.shop.model.Barbeiro;
import com.barbearia.shop.model.Cliente;
import com.barbearia.shop.model.Servico;
import com.barbearia.shop.repository.AgendamentoRepository;
import com.barbearia.shop.repository.BarbeiroRepository;
import com.barbearia.shop.repository.ClienteRepository;
import com.barbearia.shop.repository.ServicoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

public class AgendamentoService {

    @Autowired
    private ServicoRepository servicoRepository;

    @Autowired
    private BarbeiroRepository barbeiroRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private AgendamentoRepository agendamentoRepository;


    public Agendamento agendar(Agendamento agendamento, Long clienteId, Long barbeiroId, Long servicoId) {

        Cliente cliente = clienteRepository.findById(clienteId)
                .orElseThrow(() -> new EntityNotFoundException("Cliente não encontrado"));

        Barbeiro barbeiro = barbeiroRepository.findById(barbeiroId)
                .orElseThrow(() -> new EntityNotFoundException("Barbeiro não encontrado"));

        Servico servico = servicoRepository.findById(servicoId)
                .orElseThrow(() -> new EntityNotFoundException("Serviço não encontrado"));

        agendamento.setCliente(cliente);
        agendamento.setBarbeiro(barbeiro);
        agendamento.setServico(servico);

        return agendamentoRepository.save(agendamento);
    }
}