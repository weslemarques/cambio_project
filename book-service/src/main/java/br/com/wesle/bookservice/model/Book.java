package br.com.wesle.bookservice.model;

import lombok.Data;

import java.util.Date;


@Data
public class Book {

    private Long id;
    private String author;
    private Date launchDate;
    private Double price;
    private String title;
    private String currency;
    private String environment;

    public Book() {
    }

}
