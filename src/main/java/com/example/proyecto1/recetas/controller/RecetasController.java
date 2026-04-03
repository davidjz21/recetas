package com.example.proyecto1.recetas.controller;

import com.example.proyecto1.recetas.model.Receta;
import com.example.proyecto1.recetas.service.RecetasService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recetas")
public class RecetasController {
    private final RecetasService service;

    public RecetasController(RecetasService service) {
        this.service = service;
    }

    @GetMapping
    public List<Receta> obtenerTodas() {
        return service.obtenerTodas();
    }

    @GetMapping("/{id}")
    public Receta obtenerPorId(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }

    @PostMapping
    public Receta crear(@Valid @RequestBody Receta receta) {
        return service.crear(receta);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}