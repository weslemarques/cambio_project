package br.com.wesle.cambioservice.controller;

import br.com.wesle.cambioservice.contract.CambioService;
import br.com.wesle.cambioservice.dtos.BookRequestDTO;
import br.com.wesle.cambioservice.dtos.CambioResponseDTO;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cambio-service")
public class CambioController {

    private final CambioService cambioService;

    public CambioController(Environment environment, CambioService cambioService) {
        this.cambioService = cambioService;
    }

    @PostMapping
    public ResponseEntity<CambioResponseDTO> getCambio(@RequestBody BookRequestDTO bookRequestDTO){
       var cambioResponse = cambioService.getCambio(bookRequestDTO.getFrom()
                                                    ,bookRequestDTO.getTo(),
                                                    bookRequestDTO.getAmount());
        return ResponseEntity.ok(cambioResponse);
    }

}
