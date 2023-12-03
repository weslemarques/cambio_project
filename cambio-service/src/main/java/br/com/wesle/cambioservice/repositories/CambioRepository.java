package br.com.wesle.cambioservice.repositories;

import br.com.wesle.cambioservice.model.Cambio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CambioRepository extends JpaRepository<Cambio, Long> {



}
