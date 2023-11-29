package br.com.wesle.cambioservice.contract;

import br.com.wesle.cambioservice.dtos.CambioResponseDTO;

import java.math.BigDecimal;

public interface CambioService {

    public CambioResponseDTO getCambio(String from, String to, BigDecimal amount);
}
