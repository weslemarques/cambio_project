package br.com.wesle.bookservice.controller;

import br.com.wesle.bookservice.dtos.request.BookRequestDTO;
import br.com.wesle.bookservice.dtos.response.BookResponseDTO;
import br.com.wesle.bookservice.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book-service")
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }


    @PostMapping
    public ResponseEntity<BookResponseDTO> getBook(@RequestBody BookRequestDTO requestDTO){
        var response  = service.getBookById(requestDTO.id(), requestDTO.currency());
        response.setCurrency(requestDTO.currency());
        return ResponseEntity.ok(response);
    }

}
