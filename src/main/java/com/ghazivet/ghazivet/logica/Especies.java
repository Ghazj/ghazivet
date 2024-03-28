package com.ghazivet.ghazivet.logica;

import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Especies {

    @Id
    private int id_especie;
    private String nombre;
    private String descripcion;
    private String categoria;

    @OneToMany
    private List<Mascotas> mascotas;

    public Especies() {
    }

    public Especies(int id_especie, String nombre, String descripcion, String categoria, List<Mascotas> mascotas) {
        this.id_especie = id_especie;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.mascotas = mascotas;
    }

    public int getId_especie() {
        return id_especie;
    }

    public void setId_especie(int id_especie) {
        this.id_especie = id_especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public List<Mascotas> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascotas> mascotas) {
        this.mascotas = mascotas;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.id_especie;
        hash = 41 * hash + Objects.hashCode(this.nombre);
        hash = 41 * hash + Objects.hashCode(this.descripcion);
        hash = 41 * hash + Objects.hashCode(this.categoria);
        hash = 41 * hash + Objects.hashCode(this.mascotas);
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
        final Especies other = (Especies) obj;
        if (this.id_especie != other.id_especie) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        if (!Objects.equals(this.categoria, other.categoria)) {
            return false;
        }
        return Objects.equals(this.mascotas, other.mascotas);
    }

    @Override
    public String toString() {
        return "Especies{" + "id_especie=" + id_especie + ", nombre=" + nombre + ", descripcion=" + descripcion + ", categoria=" + categoria + ", mascotas=" + mascotas + '}';
    }

}
