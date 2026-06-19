package com.barbearia.shop.controller;

import com.barbearia.shop.model.Servico;
import com.barbearia.shop.service.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/servicos")
public class ServicoController {

    @Autowired
    private ServicoService servicoService;

    @PostMapping
    public ResponseEntity<Servico> cadastrar(@RequestBody Servico servico) {
        Servico novoServico = servicoService.createServico(servico);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoServico);
    }
}