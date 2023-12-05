package br.com.wesle.bookservice.service;

import br.com.wesle.bookservice.dtos.BookResponseDTO;
import br.com.wesle.bookservice.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import javax.print.DocFlavor;
import java.util.Date;

@Service
public class BookService {

    private final BookRepository repository;

    private final Environment environment;
    public BookService(BookRepository repository, Environment environment) {
        this.repository = repository;
        this.environment = environment;
    }

    public BookResponseDTO getBookById(Long id){
        var bookEntity = repository.getReferenceById(id);

        var port = environment.getProperty("local.server.port");
        return BookResponseDTO.builder()
                .title(bookEntity.getTitle())
                .price(bookEntity.getPrice())
                .id(bookEntity.getId())
                .author(bookEntity.getAuthor())
                .launchDate(bookEntity.getLaunchDate())
                .currency("USD")
                .environment(port)
                .build();
    }
}

