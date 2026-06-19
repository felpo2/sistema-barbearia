package com.barbearia.shop.controller;

import com.barbearia.shop.model.Barbeiro;
import com.barbearia.shop.service.BarbeiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/barbeiros")
public class BarbeiroController {

    @Autowired
    private BarbeiroService barbeiroService;

    @PostMapping
    public ResponseEntity<Barbeiro> cadastrar(@RequestBody Barbeiro barbeiro) {
        Barbeiro novoBarbeiro = barbeiroService.createBarbeiro(barbeiro);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoBarbeiro);
    }
}