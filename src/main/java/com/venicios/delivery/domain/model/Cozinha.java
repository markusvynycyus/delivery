package com.venicios.delivery.domain.model;


import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
//@Table(name = "cozinha")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cozinha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(nullable = false)
    private String nome;



}
