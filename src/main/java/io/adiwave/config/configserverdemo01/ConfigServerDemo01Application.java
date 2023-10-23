package io.adiwave.config.configserverdemo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerDemo01Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerDemo01Application.class, args);
    }

}
