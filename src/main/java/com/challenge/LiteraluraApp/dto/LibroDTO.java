package com.challenge.LiteraluraApp.dto;


import com.challenge.LiteraluraApp.model.Idioma;

public record LibroDTO(
        String titulo,
        Idioma idioma,
        Double numeroDeDescargas
) {
}
