package com.barbearia.shop.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb-agendamento")
@Getter
@Setter
@Builder
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer barber_id;
    private Integer client_id;
    private Integer service_id;

    private String appointmentDateTime;
    private Boolean status;
}
