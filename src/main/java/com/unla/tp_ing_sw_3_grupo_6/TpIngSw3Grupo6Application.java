package com.unla.tp_ing_sw_3_grupo_6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class TpIngSw3Grupo6Application {

	public static void main(String[] args) {
		SpringApplication.run(TpIngSw3Grupo6Application.class, args);
	}

}
