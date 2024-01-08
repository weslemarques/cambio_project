package br.com.wesle.bookservice.service;

import br.com.wesle.bookservice.consumer.CambioConsumer;
import br.com.wesle.bookservice.dtos.request.CambioRequestDTO;
import br.com.wesle.bookservice.dtos.response.BookResponseDTO;
import br.com.wesle.bookservice.model.Book;
import br.com.wesle.bookservice.repository.BookRepository;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookRepository repository;
    private final Environment environment;
    private final CambioConsumer consumer;
    public BookService(BookRepository repository, Environment environment, CambioConsumer consumer) {
        this.repository = repository;
        this.environment = environment;
        this.consumer = consumer;
    }

    public BookResponseDTO getBookById(Long id, String currency){
        Book book = repository.getReferenceById(id);
        var port = environment.getProperty("local.server.port");
        CambioRequestDTO request = new CambioRequestDTO(book.getPrice(),"USD",currency);
        var response = consumer.getCambio(request);
        if (response.getStatusCode().value() == 200 && response.hasBody())
            return BookResponseDTO.builder()
                .title(book.getTitle())
                .price(response.getBody().getConverteValue().doubleValue())
                .id(book.getId())
                .author(book.getAuthor())
                .launchDate(book.getLaunchDate())
                .currency("USD")
                .environment(port)
                .build();
        else
            throw new RuntimeException("Requisição falhou");
    }
}

