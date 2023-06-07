package com.proyectoSistemas.sistemavuelos.Controllers;

import com.proyectoSistemas.sistemavuelos.Interfaces.ClienteRepository;
import com.proyectoSistemas.sistemavuelos.Models.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = "http://localhost:4200")
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getClienteById(@PathVariable int id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        if (cliente.isPresent()) {
            return ResponseEntity.ok(cliente.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/")
    public ResponseEntity<Cliente> insertCliente(@RequestBody Cliente cliente) {
        Cliente newCliente = clienteRepository.save(cliente);
        return ResponseEntity.ok(newCliente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> updateCliente(@PathVariable int id, @RequestBody Cliente cliente) {
        Optional<Cliente> clienteOptional = clienteRepository.findById(id);

        if (clienteOptional.isPresent()) {
            Cliente existingCliente = clienteOptional.get();
            existingCliente.setSexo(cliente.getSexo());
            existingCliente.setNombre(cliente.getNombre());
            existingCliente.setNacionalidad(cliente.getNacionalidad());
            existingCliente.setFirma(cliente.getFirma());
            existingCliente.setFechaNacimiento(cliente.getFechaNacimiento());

            Cliente updatedCliente = clienteRepository.save(existingCliente);
            return ResponseEntity.ok(updatedCliente);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteClienteById(@PathVariable int id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        if (cliente.isPresent()) {
            clienteRepository.delete(cliente.get());
            return ResponseEntity.ok("Cliente deleted");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
