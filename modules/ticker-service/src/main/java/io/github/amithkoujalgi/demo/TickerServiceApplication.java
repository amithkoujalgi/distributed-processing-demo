package io.github.amithkoujalgi.demo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = {"io.github.amithkoujalgi.demo.config", "io.github.amithkoujalgi.demo.controllers", "io.github.amithkoujalgi.demo.repositories", "io.github.amithkoujalgi.demo.initializers"})
@OpenAPIDefinition(info = @Info(title = "Ticker Service"))
@EnableDiscoveryClient
public class TickerServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(TickerServiceApplication.class, args);
    }
}