package com.proyectoSistemas.sistemavuelos.Models;

import javax.persistence.*;

@Entity
@Table(name = "vuelo")
public class Vuelo {
    @Id
    @Column(name = "id_vuelo")
    private int idVuelo;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @Column(name = "salida")
    private String salida;

    @Column(name = "destino")
    private String destino;

    @Column(name = "asiento")
    private String asiento;

    @Column(name = "maletas")
    private int maletas;

    // Getters y Setters

    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public int getMaletas() {
        return maletas;
    }

    public void setMaletas(int maletas) {
        this.maletas = maletas;
    }
}

