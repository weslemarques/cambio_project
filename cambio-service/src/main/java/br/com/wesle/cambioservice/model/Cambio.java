package br.com.wesle.cambioservice.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "cambio")
@EqualsAndHashCode(of = "id")
public class Cambio{

    @Id
    @GeneratedValue
    private Long id;
    @Column(name="from_currency",nullable = false,length = 3)
    private String from;
    @Column(name="to_currency",nullable = false,length = 3)
    private String to;

    @Column(nullable = false, precision = 10,scale = 2)
    private BigDecimal conversionFactor;

    public Cambio() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConversionFactor() {
        return conversionFactor;
    }

    public void setConversionFactor(BigDecimal conversionFactor) {
        this.conversionFactor = conversionFactor;
    }
}
