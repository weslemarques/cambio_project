package br.com.wesle.cambioservice.dtos;

import lombok.Getter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
public class BookRequestDTO implements Serializable {
    private Double amount;
    private String from;
    private String to;

    public BookRequestDTO() {
    }

    public BookRequestDTO(Double amount, String from, String to) {
        this.amount = amount;
        this.from = from;
        this.to = to;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
