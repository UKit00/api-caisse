package com.defitech.pharmacie.caisse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.defitech.pharmacie.core.entity")
public class GestionDesVentesApplication {
	//Code recommiter

	public static void main(String[] args) {
		SpringApplication.run(GestionDesVentesApplication.class, args);
	}

}
