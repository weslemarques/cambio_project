package com.wesle.cambioservice.adapters.dtos;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Builder
@Getter
public class CambioResponseDTO {

    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionFactor;
    private BigDecimal converteValue;
    private String enviroment;

    public CambioResponseDTO() {
    }

    public CambioResponseDTO(Long id, String from, String to, BigDecimal conversionFactor, BigDecimal converteValue, String enviroment) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionFactor = conversionFactor;
        this.converteValue = converteValue;
        this.enviroment = enviroment;
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

    public double getConverteValue() {
        return Double.parseDouble(String.format("%.2f",converteValue));
    }

    public void setConverteValue(BigDecimal converteValue) {
        this.converteValue = converteValue;
    }

    public void setEnviroment(String enviroment) {
        this.enviroment = enviroment;
    }

}
