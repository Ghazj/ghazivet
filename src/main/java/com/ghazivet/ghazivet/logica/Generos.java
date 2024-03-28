package com.ghazivet.ghazivet.logica;

import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Generos {

    @Id
    private int id_genero;
    private String descripcion;

    @OneToMany
    private List<Mascotas> mascotas;

    public Generos() {
    }

    public Generos(int id_genero, String descripcion, List<Mascotas> mascotas) {
        this.id_genero = id_genero;
        this.descripcion = descripcion;
        this.mascotas = mascotas;
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

    public List<Mascotas> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascotas> mascotas) {
        this.mascotas = mascotas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.id_genero;
        hash = 41 * hash + Objects.hashCode(this.descripcion);
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
        final Generos other = (Generos) obj;
        if (this.id_genero != other.id_genero) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        return Objects.equals(this.mascotas, other.mascotas);
    }

    @Override
    public String toString() {
        return "Generos{" + "id_genero=" + id_genero + ", descripcion=" + descripcion + ", mascotas=" + mascotas + '}';
    }

}
