package com.barbearia.shop.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb-service")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Long price;
    private Integer durationInMinutes;
}
