package br.com.wesle.bookservice.controller;

import br.com.wesle.bookservice.dtos.BookResponseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/book-service")
public class BookController {

    @GetMapping("/{id}/{currency}")
    public BookResponseDTO getBook(@PathVariable Long id , @PathVariable String currency){
        return BookResponseDTO.builder()
                .title("Dev Melhor")
                .price(34.5)
                .id(id)
                .author("Wesle")
                .launchDate(new Date())
                .currency(currency)
                .environment("8100")
                .build();
    }

}
