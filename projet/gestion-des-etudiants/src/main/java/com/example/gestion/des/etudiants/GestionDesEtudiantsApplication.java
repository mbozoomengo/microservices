package com.example.gestion.des.etudiants;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GestionDesEtudiantsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionDesEtudiantsApplication.class, args);
	}

}
