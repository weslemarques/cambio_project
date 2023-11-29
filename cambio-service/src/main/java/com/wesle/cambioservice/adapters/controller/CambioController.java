package com.wesle.cambioservice.adapters.controller;

import com.wesle.cambioservice.adapters.dtos.BookRequestDTO;
import com.wesle.cambioservice.adapters.dtos.CambioResponseDTO;
import com.wesle.cambioservice.application.contract.CambioService;
import org.springframework.beans.factory.annotation.Autowired;
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
