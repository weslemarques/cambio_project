package br.com.wesle.bookservice.dtos.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Builder
@Getter
@Setter
public class CambioResponseDTO implements Serializable {

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


}
