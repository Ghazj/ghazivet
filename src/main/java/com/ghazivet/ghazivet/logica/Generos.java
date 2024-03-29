package com.ghazivet.ghazivet.logica;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Generos {

    @Id
    private int id_genero;
    private String descripcion;

    public Generos() {
    }

    public Generos(int id_genero, String descripcion) {
        this.id_genero = id_genero;
        this.descripcion = descripcion;
    }

    public int getId_genero() {
        return id_genero;
    }

    public void setId_genero(int id_genero) {
        this.id_genero = id_genero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.id_genero;
        hash = 17 * hash + Objects.hashCode(this.descripcion);
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
        final Generos other = (Generos) obj;
        if (this.id_genero != other.id_genero) {
            return false;
        }
        return Objects.equals(this.descripcion, other.descripcion);
    }

    @Override
    public String toString() {
        return "Generos{" + "id_genero=" + id_genero + ", descripcion=" + descripcion + '}';
    }
}
