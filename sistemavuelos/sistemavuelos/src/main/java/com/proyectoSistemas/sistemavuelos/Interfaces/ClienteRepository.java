package com.proyectoSistemas.sistemavuelos.Interfaces;

import com.proyectoSistemas.sistemavuelos.Models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    // Puedes agregar métodos de consulta personalizados aquí si es necesario
}
