package br.com.wesle.cambioservice.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@Entity
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

    public Cambio(Long id, String from, String to, BigDecimal conversionFactor) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionFactor = conversionFactor;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setConversionFactor(BigDecimal conversionFactor) {
        this.conversionFactor = conversionFactor;
    }
}
