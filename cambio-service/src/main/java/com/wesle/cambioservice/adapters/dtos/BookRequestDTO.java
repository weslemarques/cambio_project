package com.wesle.cambioservice.adapters.dtos;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class BookRequestDTO {
    private BigDecimal amount;
    private String from;
    private String to;
}
