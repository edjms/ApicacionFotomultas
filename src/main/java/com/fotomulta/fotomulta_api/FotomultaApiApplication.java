package com.fotomulta.fotomulta_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;



@SpringBootApplication
public class FotomultaApiApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(FotomultaApiApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(FotomultaApiApplication.class);
	}
}
