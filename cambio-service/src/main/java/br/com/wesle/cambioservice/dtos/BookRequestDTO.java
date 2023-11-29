package br.com.wesle.cambioservice.dtos;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
public class BookRequestDTO implements Serializable {
    private BigDecimal amount;
    private String from;
    private String to;
}
