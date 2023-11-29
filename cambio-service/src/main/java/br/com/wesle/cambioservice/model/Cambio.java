package br.com.wesle.cambioservice.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "cambio")
@Data
public class Cambio {

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
