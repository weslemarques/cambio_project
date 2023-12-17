package br.com.wesle.bookservice.dtos.response;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
@Builder
public class BookResponseDTO implements Serializable {

    private Long id;
    private String author;
    private Date launchDate;
    private Double price;
    private String title;
    private String currency;
    private String environment;

    public BookResponseDTO() {
    }

    public BookResponseDTO(Long id, String author, Date launchDate, Double price, String title, String currency, String environment) {
        this.id = id;
        this.author = author;
        this.launchDate = launchDate;
        this.price = price;
        this.title = title;
        this.currency = currency;
        this.environment = environment;
    }
}
