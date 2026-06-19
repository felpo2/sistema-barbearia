package com.barbearia.shop.controller;

import com.barbearia.shop.model.Agendamento;
import com.barbearia.shop.service.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/agendamentos")
public class AgendamentoController {

    @Autowired
    private AgendamentoService agendamentoService;

    @PostMapping
    public ResponseEntity<Agendamento> criar(
            @RequestBody Agendamento agendamento,
            @RequestParam Long clienteId,
            @RequestParam Long barbeiroId,
            @RequestParam Long servicoId) {

        Agendamento novoAgendamento = agendamentoService.agendar(agendamento, clienteId, barbeiroId, servicoId);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoAgendamento);
    }
}