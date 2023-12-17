package br.com.wesle.cambioservice.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "cambio")
public final class Cambio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="from_currency",nullable = false,length = 3)
    private String from;
    @Column(name="to_currency",nullable = false,length = 3)
    private String to;

    @Column(nullable = false)
    private BigDecimal conversionFactor;

    public Cambio() {
    }
}
