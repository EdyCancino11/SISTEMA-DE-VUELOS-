package com.proyectoSistemas.sistemavuelos.Models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "empresa")
public class Empresa {
    @Id
    @Column(name = "id_empresa")
    private int idEmpresa;

    @ManyToOne
    @JoinColumn(name = "id_vuelo")
    private Vuelo vuelo;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "lugar")
    private String lugar;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "numero_reserva")
    private int numeroReserva;

    @Column(name = "departamento")
    private String departamento;

    @Column(name = "ticket")
    private byte[] ticket;

    @Column(name = "valido")
    private char valido;

    @Column(name = "registro")
    private Date registro;

    // Getters y Setters

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumeroReserva() {
        return numeroReserva;
    }

    public void setNumeroReserva(int numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public byte[] getTicket() {
        return ticket;
    }

    public void setTicket(byte[] ticket) {
        this.ticket = ticket;
    }

    public char getValido() {
        return valido;
    }

    public void setValido(char valido) {
        this.valido = valido;
    }

    public Date getRegistro() {
        return registro;
    }

    public void setRegistro(Date registro) {
        this.registro = registro;
    }
}
