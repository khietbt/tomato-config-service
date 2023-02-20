package io.github.khietbt.tomatoconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class TomatoConfigServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(TomatoConfigServiceApplication.class, args);
    }
}