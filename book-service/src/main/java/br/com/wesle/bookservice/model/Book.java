package br.com.wesle.bookservice.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;


@Data
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String author;
    private Date launchDate;
    private Double price;
    private String title;

    public Book() {
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
