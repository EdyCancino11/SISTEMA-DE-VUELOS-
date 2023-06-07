package com.proyectoSistemas.sistemavuelos.Controllers;

import com.proyectoSistemas.sistemavuelos.Interfaces.UsuarioRepository;
import com.proyectoSistemas.sistemavuelos.Models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioController {
  @Autowired
  private UsuarioRepository usuarioRepository;

  @GetMapping
  public List<Usuario> getAllUsuarios() {
    return usuarioRepository.findAll();
  }

  @GetMapping("/{id}")
  public ResponseEntity<Usuario> getUsuarioById(@PathVariable int id) {
    Optional<Usuario> usuario = usuarioRepository.findById(id);
    if (usuario.isPresent()) {
      return ResponseEntity.ok(usuario.get());
    } else {
      return ResponseEntity.notFound().build();
    }
  }

  @PostMapping
  public ResponseEntity<Usuario> insertUsuario(@RequestBody Usuario usuario) {
    Usuario newUsuario = usuarioRepository.save(usuario);
    return ResponseEntity.ok(newUsuario);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Usuario> updateUsuario(@PathVariable int id, @RequestBody Usuario usuario) {
    Optional<Usuario> usuarioOptional = usuarioRepository.findById(id);

    if (usuarioOptional.isPresent()) {
      Usuario existingUsuario = usuarioOptional.get();
      existingUsuario.setCliente(usuario.getCliente());
      existingUsuario.setUsername(usuario.getUsername());
      existingUsuario.setPassword(usuario.getPassword());

      Usuario updatedUsuario = usuarioRepository.save(existingUsuario);
      return ResponseEntity.ok(updatedUsuario);
    } else {
      return ResponseEntity.notFound().build();
    }
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<String> deleteUsuarioById(@PathVariable int id) {
    Optional<Usuario> usuario = usuarioRepository.findById(id);
    if (usuario.isPresent()) {
      usuarioRepository.delete(usuario.get());
      return ResponseEntity.ok("Usuario deleted");
    } else {
      return ResponseEntity.notFound().build();
    }
  }

  @PostMapping("/login")
  public ResponseEntity<String> login(@RequestBody Usuario usuario) {
    String username = usuario.getUsername();
    String password = usuario.getPassword();

    Optional<Usuario> usuarioOptional = usuarioRepository.findByUsernameAndPassword(username, password);
    if (usuarioOptional.isPresent()) {
      return ResponseEntity.ok("1");
    } else {
      return ResponseEntity.status(401).body("0");
    }
  }
}
