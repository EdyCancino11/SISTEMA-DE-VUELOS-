package com.proyectoSistemas.sistemavuelos.Models;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @Column(name = "id_cliente")
    private int idCliente;

    @Column(name = "sexo")
    private char sexo;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "nacionalidad")
    private String nacionalidad;

    @Lob
    @Column(name = "firma")
    private byte[] firma;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    // Getters y Setters

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public byte[] getFirma() {
        return firma;
    }

    public void setFirma(byte[] firma) {
        this.firma = firma;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
