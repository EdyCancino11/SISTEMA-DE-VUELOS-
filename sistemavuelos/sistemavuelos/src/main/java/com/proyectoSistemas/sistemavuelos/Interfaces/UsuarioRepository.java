package com.proyectoSistemas.sistemavuelos.Interfaces;

import com.proyectoSistemas.sistemavuelos.Models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
  Optional<Usuario> findByUsernameAndPassword(String username, String password);
}
