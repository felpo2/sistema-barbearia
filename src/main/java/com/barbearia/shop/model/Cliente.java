package com.barbearia.shop.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "tb-cliente")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private Long phoneNumber;
    private String email;


}
