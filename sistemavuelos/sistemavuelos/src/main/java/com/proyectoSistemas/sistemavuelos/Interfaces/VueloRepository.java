package com.proyectoSistemas.sistemavuelos.Interfaces;

import com.proyectoSistemas.sistemavuelos.Models.Vuelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VueloRepository extends JpaRepository<Vuelo, Integer> {
    // Puedes agregar métodos de consulta personalizados aquí si es necesario
}

