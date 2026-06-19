package com.barbearia.shop.controller;

import com.barbearia.shop.model.Cliente;
import com.barbearia.shop.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity<Cliente> cadastrar(@RequestBody Cliente cliente) {
        Cliente novoCliente = clienteService.createCliente(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoCliente);
    }
}