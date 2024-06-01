package com.challenge.LiteraluraApp.repositorio;

import com.challenge.LiteraluraApp.model.Idioma;
import com.challenge.LiteraluraApp.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LibroRepository extends JpaRepository<Libro, Long> {

    Optional<Libro> findByTituloContainsIgnoreCase(String titulo);

    List<Libro> findByIdioma(Idioma idioma);

}
