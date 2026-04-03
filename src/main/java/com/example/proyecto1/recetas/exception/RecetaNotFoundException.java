package com.example.proyecto1.recetas.exception;

public class RecetaNotFoundException extends RuntimeException {
    public RecetaNotFoundException(Long id) {
        super("No se encontró la receta con id: " + id);
    }
}