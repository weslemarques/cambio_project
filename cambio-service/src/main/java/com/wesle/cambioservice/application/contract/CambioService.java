package com.wesle.cambioservice.application.contract;

import com.wesle.cambioservice.adapters.dtos.CambioResponseDTO;

import java.math.BigDecimal;

public interface CambioService {

    public CambioResponseDTO getCambio(String from, String to, BigDecimal amount);
}
