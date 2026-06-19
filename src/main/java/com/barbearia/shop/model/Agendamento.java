package com.barbearia.shop.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_agendamento")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @ManyToOne
    @JoinColumn(name = "barber_id")
    private Barbeiro barbeiro;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "service_id")
    private Servico servico;

    private String appointmentDateTime;
    private Boolean status;
}