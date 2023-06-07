package com.proyectoSistemas.sistemavuelos.Models;


import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @Column(name = "id_usuario")
    private int idUsuario;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    // Getters y Setters

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
