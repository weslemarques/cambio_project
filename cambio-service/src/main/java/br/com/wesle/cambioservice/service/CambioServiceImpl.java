package br.com.wesle.cambioservice.service;

import br.com.wesle.cambioservice.contract.CambioService;
import br.com.wesle.cambioservice.dtos.BookRequestDTO;
import br.com.wesle.cambioservice.dtos.CambioResponseDTO;
import br.com.wesle.cambioservice.repositories.CambioRepository;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class CambioServiceImpl implements CambioService {

    private final CambioRepository cambioRepository;
    private final Environment environment;

    public CambioServiceImpl(CambioRepository cambioRepository, Environment environment) {
        this.cambioRepository = cambioRepository;
        this.environment = environment;
    }

    @Override
    public CambioResponseDTO getCambio(BookRequestDTO bookRequestDTO) {
        var cambio  = cambioRepository.findByFromAndTo(bookRequestDTO.getFrom(),bookRequestDTO.getTo());
        var port  = environment.getProperty("local.server.port");

        CambioResponseDTO responseDTO = CambioResponseDTO.builder()
                                                        .id(cambio.getId())
                                                        .to(cambio.getTo())
                                                        .from(cambio.getFrom())
                                                        .conversionFactor(cambio.getConversionFactor())
                                                         .converteValue(bookRequestDTO.getAmount().multiply(cambio
                                                                 .getConversionFactor()))
                                                                    .enviroment(port).build();
        return responseDTO;
    }

}
