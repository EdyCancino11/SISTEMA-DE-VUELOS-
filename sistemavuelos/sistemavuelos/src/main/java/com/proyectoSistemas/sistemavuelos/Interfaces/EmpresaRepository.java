package com.proyectoSistemas.sistemavuelos.Interfaces;


import com.proyectoSistemas.sistemavuelos.Models.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {
    // Puedes agregar métodos de consulta personalizados aquí si es necesario
}

