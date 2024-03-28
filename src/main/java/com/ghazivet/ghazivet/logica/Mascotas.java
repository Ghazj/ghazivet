package com.ghazivet.ghazivet.logica;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Mascotas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_mascota;   
    private String nombre;
    private String color;
    private String raza;
    private int edad;
    private int peso;
    
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

    public Mascotas(int id_mascota, String nombre, String color, String raza, int edad, int peso, Duenios duenio, Especies especie, Generos genero) {
        this.id_mascota = id_mascota;
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
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
        hash = 29 * hash + this.id_mascota;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        hash = 29 * hash + Objects.hashCode(this.color);
        hash = 29 * hash + Objects.hashCode(this.raza);
        hash = 29 * hash + this.edad;
        hash = 29 * hash + this.peso;
        hash = 29 * hash + Objects.hashCode(this.duenio);
        hash = 29 * hash + Objects.hashCode(this.especie);
        hash = 29 * hash + Objects.hashCode(this.genero);
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
        if (this.edad != other.edad) {
            return false;
        }
        if (this.peso != other.peso) {
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
        return "Mascotas{" + "id_mascota=" + id_mascota + ", nombre=" + nombre + ", color=" + color + ", raza=" + raza + ", edad=" + edad + ", peso=" + peso + ", duenio=" + duenio + ", especie=" + especie + ", genero=" + genero + '}';
    }

    
    
}
