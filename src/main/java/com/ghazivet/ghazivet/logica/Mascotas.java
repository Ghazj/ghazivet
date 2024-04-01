package com.ghazivet.ghazivet.logica;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Mascotas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_mascota;
    private String nombre;
    private String color;
    private String raza;
    private Date edad;
    private Timestamp fecha_creacion;
    private Timestamp fecha_actualizacion;

    @ManyToOne
    @JoinColumn(name = "id_duenio")
    private Duenios duenio;
    @ManyToOne
    @JoinColumn(name = "id_especie")
    private Especies especie;
    @ManyToOne
    @JoinColumn(name = "id_genero")
    private Generos genero;

    public Mascotas() {
    }

    public Mascotas(int id_mascota, String nombre, String color, String raza, Date edad, Timestamp fecha_creacion, Timestamp fecha_actualizacion, Duenios duenio, Especies especie, Generos genero) {
        this.id_mascota = id_mascota;
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
        this.edad = edad;
        this.fecha_creacion = fecha_creacion;
        this.fecha_actualizacion = fecha_actualizacion;
        this.duenio = duenio;
        this.especie = especie;
        this.genero = genero;
    }

    public int getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(int id_mascota) {
        this.id_mascota = id_mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Date getEdad() {
        return edad;
    }

    public void setEdad(Date edad) {
        this.edad = edad;
    }

    public Timestamp getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Timestamp fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public Timestamp getFecha_actualizacion() {
        return fecha_actualizacion;
    }

    public void setFecha_actualizacion(Timestamp fecha_actualizacion) {
        this.fecha_actualizacion = fecha_actualizacion;
    }

    public Duenios getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenios duenio) {
        this.duenio = duenio;
    }

    public Especies getEspecie() {
        return especie;
    }

    public void setEspecie(Especies especie) {
        this.especie = especie;
    }

    public Generos getGenero() {
        return genero;
    }

    public void setGenero(Generos genero) {
        this.genero = genero;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.id_mascota;
        hash = 83 * hash + Objects.hashCode(this.nombre);
        hash = 83 * hash + Objects.hashCode(this.color);
        hash = 83 * hash + Objects.hashCode(this.raza);
        hash = 83 * hash + Objects.hashCode(this.edad);
        hash = 83 * hash + Objects.hashCode(this.fecha_creacion);
        hash = 83 * hash + Objects.hashCode(this.fecha_actualizacion);
        hash = 83 * hash + Objects.hashCode(this.duenio);
        hash = 83 * hash + Objects.hashCode(this.especie);
        hash = 83 * hash + Objects.hashCode(this.genero);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mascotas other = (Mascotas) obj;
        if (this.id_mascota != other.id_mascota) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        if (!Objects.equals(this.raza, other.raza)) {
            return false;
        }
        if (!Objects.equals(this.edad, other.edad)) {
            return false;
        }
        if (!Objects.equals(this.fecha_creacion, other.fecha_creacion)) {
            return false;
        }
        if (!Objects.equals(this.fecha_actualizacion, other.fecha_actualizacion)) {
            return false;
        }
        if (!Objects.equals(this.duenio, other.duenio)) {
            return false;
        }
        if (!Objects.equals(this.especie, other.especie)) {
            return false;
        }
        return Objects.equals(this.genero, other.genero);
    }

    @Override
    public String toString() {
        return "Mascotas{" + "id_mascota=" + id_mascota + ", nombre=" + nombre + ", color=" + color + ", raza=" + raza + ", edad=" + edad + ", fecha_creacion=" + fecha_creacion + ", fecha_actualizacion=" + fecha_actualizacion + ", duenio=" + duenio + ", especie=" + especie + ", genero=" + genero + '}';
    }
}
