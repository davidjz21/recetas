package com.example.proyecto1.recetas.service;

import com.example.proyecto1.recetas.exception.RecetaNotFoundException;
import com.example.proyecto1.recetas.model.Receta;
import com.example.proyecto1.recetas.repository.RecetasRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecetasService {
    private final RecetasRepository repository;

    public RecetasService(RecetasRepository repository) {
        this.repository = repository;
    }

    public List<Receta> obtenerTodas() {
        return repository.findAll();
    }

    public Receta obtenerPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RecetaNotFoundException(id));
    }

    public Receta crear(Receta receta) {
        return repository.save(receta);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }

}
