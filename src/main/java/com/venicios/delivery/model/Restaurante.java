package com.venicios.delivery.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.DateTimeException;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Restaurante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(name = "taxa_frete", nullable = false)
    private BigDecimal taxaFrete;

    private Boolean ativo;
    private Boolean aberto;
    private Date dataCadastro;
    private Date dataAtualizacao;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Cozinha cozinha;
}
