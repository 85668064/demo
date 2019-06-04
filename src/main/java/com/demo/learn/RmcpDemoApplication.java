package com.demo.learn;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.demo.learn.learn.service.StorageService;


@SpringBootApplication
public class RmcpDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RmcpDemoApplication.class, args);
	}
	
	@Bean
    CommandLineRunner init(final StorageService storageService) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                storageService.deleteAll();
                storageService.init();
            }
        };
    }
}
