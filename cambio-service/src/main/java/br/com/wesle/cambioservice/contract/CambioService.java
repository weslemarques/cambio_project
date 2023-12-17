package br.com.wesle.cambioservice.contract;

import br.com.wesle.cambioservice.dtos.BookRequestDTO;
import br.com.wesle.cambioservice.dtos.CambioResponseDTO;
import br.com.wesle.cambioservice.model.Cambio;

import java.math.BigDecimal;

public interface CambioService {

    public CambioResponseDTO getCambio(BookRequestDTO bookRequestDTO);

}
