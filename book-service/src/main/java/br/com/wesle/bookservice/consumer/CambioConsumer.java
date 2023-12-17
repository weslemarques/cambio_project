package br.com.wesle.bookservice.consumer;

import br.com.wesle.bookservice.dtos.request.CambioRequestDTO;
import br.com.wesle.bookservice.dtos.response.CambioResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "cambio-service", url = "localhost:8000")
public interface CambioConsumer {

    @PostMapping("cambio-service")
    public ResponseEntity<CambioResponseDTO> getCambio(@RequestBody CambioRequestDTO cambioRequest) ;
}
