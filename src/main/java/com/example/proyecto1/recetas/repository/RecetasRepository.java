package com.example.proyecto1.recetas.repository;

import com.example.proyecto1.recetas.model.Receta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecetasRepository extends JpaRepository<Receta, Long> {
}
