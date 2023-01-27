package io.github.khietbt.TomatoConfigService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class TomatoConfigServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(TomatoConfigServiceApplication.class, args);
    }
}