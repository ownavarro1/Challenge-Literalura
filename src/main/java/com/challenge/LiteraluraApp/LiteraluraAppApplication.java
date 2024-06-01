package com.challenge.LiteraluraApp;

import com.challenge.LiteraluraApp.principal.Principal;

import com.challenge.LiteraluraApp.repositorio.AutorRepository;
import com.challenge.LiteraluraApp.repositorio.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraAppApplication implements CommandLineRunner {

	@Autowired
	private AutorRepository autorRepository;
	@Autowired
	private LibroRepository libroRepository;

	public static void main(String[] args)
	{
		SpringApplication.run(LiteraluraAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(autorRepository, libroRepository);
		principal.muestraMenu();
	}

}
