package com.wesle.cambioservice.application.service;

import com.wesle.cambioservice.adapters.dtos.CambioResponseDTO;
import com.wesle.cambioservice.application.contract.CambioService;
import com.wesle.cambioservice.infra.repositories.CambioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

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
        var cambio  = cambioRepository.findByFromAndTo(from,to);
        var port  = environment.getProperty("local.server.port");

        CambioResponseDTO responseDTO = CambioResponseDTO.builder()
                                                        .id(cambio.getId())
                                                        .to(cambio.getTo())
                                                        .from(cambio.getFrom())
                                                        .conversionFactor(cambio.getConversionFactor())
                                                         .converteValue(amount.multiply(cambio
                                                                 .getConversionFactor()))
                                                                    .enviroment(port).build();
        return responseDTO;
    }
}
