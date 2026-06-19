package com.barbearia.shop.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb-barber")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Barbeiro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String email;
    private String password;



}
