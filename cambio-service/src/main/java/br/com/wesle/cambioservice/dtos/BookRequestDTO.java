package br.com.wesle.cambioservice.dtos;

import lombok.Getter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
public class BookRequestDTO implements Serializable {
    private BigDecimal amount;
    private String from;
    private String to;

    public BookRequestDTO() {
    }

    public BookRequestDTO(BigDecimal amount, String from, String to) {
        this.amount = amount;
        this.from = from;
        this.to = to;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
