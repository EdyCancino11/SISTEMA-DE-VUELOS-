package com.proyectoSistemas.sistemavuelos.Controllers;

import com.proyectoSistemas.sistemavuelos.Interfaces.EmpresaRepository;
import com.proyectoSistemas.sistemavuelos.Models.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {
    @Autowired
    private EmpresaRepository empresaRepository;

    @GetMapping
    public List<Empresa> getAllEmpresas() {
        return empresaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Empresa> getEmpresaById(@PathVariable int id) {
        Optional<Empresa> empresa = empresaRepository.findById(id);
        if (empresa.isPresent()) {
            return ResponseEntity.ok(empresa.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Empresa> insertEmpresa(@RequestBody Empresa empresa) {
        Empresa newEmpresa = empresaRepository.save(empresa);
        return ResponseEntity.ok(newEmpresa);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Empresa> updateEmpresa(@PathVariable int id, @RequestBody Empresa empresa) {
        Optional<Empresa> empresaOptional = empresaRepository.findById(id);

        if (empresaOptional.isPresent()) {
            Empresa existingEmpresa = empresaOptional.get();
            existingEmpresa.setVuelo(empresa.getVuelo());
            existingEmpresa.setNombre(empresa.getNombre());
            existingEmpresa.setLugar(empresa.getLugar());
            existingEmpresa.setFecha(empresa.getFecha());
            existingEmpresa.setNumeroReserva(empresa.getNumeroReserva());
            existingEmpresa.setDepartamento(empresa.getDepartamento());
            existingEmpresa.setTicket(empresa.getTicket());
            existingEmpresa.setValido(empresa.getValido());
            existingEmpresa.setRegistro(empresa.getRegistro());

            Empresa updatedEmpresa = empresaRepository.save(existingEmpresa);
            return ResponseEntity.ok(updatedEmpresa);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmpresaById(@PathVariable int id) {
        Optional<Empresa> empresa = empresaRepository.findById(id);
        if (empresa.isPresent()) {
            empresaRepository.delete(empresa.get());
            return ResponseEntity.ok("Empresa deleted");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
