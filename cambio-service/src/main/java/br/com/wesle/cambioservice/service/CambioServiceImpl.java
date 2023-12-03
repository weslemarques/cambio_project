package br.com.wesle.cambioservice.service;

import br.com.wesle.cambioservice.model.Cambio;
import br.com.wesle.cambioservice.repositories.CambioRepository;
import br.com.wesle.cambioservice.dtos.CambioResponseDTO;
import br.com.wesle.cambioservice.contract.CambioService;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.io.EOFException;
import java.math.BigDecimal;

@Service
public class CambioServiceImpl implements CambioService {

    private final CambioRepository cambioRepository;
    private final Environment environment;

    public CambioServiceImpl(CambioRepository cambioRepository, Environment environment) {
        this.cambioRepository = cambioRepository;
        this.environment = environment;
    }

    @Override
    public CambioResponseDTO getCambio(String from, String to, BigDecimal amount) {
        Cambio cambio  = cambioRepository.findById(1L).orElseThrow(() -> new RuntimeException("Erro"));

        return CambioResponseDTO.builder()
                                                        .id(cambio.getId())
                                                        .to(cambio.getTo())
                                                        .from(cambio.getFrom())
                                                        .conversionFactor(cambio.getConversionFactor())
                                                         .converteValue(amount.multiply(cambio
                                                                 .getConversionFactor()))
                                                                    .enviroment("8000").build();
    }
}
