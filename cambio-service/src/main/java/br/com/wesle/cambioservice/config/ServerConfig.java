package br.com.wesle.cambioservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("cambio-service")
public class ServerConfig {
}
