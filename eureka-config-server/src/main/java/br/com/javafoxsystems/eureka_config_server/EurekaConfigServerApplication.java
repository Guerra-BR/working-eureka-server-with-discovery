package br.com.javafoxsystems.eureka_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaConfigServerApplication.class, args);
	}
}
