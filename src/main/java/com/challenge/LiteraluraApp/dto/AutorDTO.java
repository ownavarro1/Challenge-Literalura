package com.challenge.LiteraluraApp.dto;

public record AutorDTO(
        Long Id,
        String nombre,
        Integer fechaDeNacimiento,
        Integer fechaDeFallecimiento
) {
}
