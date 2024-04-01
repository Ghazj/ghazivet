package com.ghazivet.ghazivet.logica;

import java.sql.Timestamp;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Duenios {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_duenio;    
    private int id_documento_duenio;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private Timestamp fecha_creacion;
    private Timestamp fecha_actualizacion;

    public Duenios() {
    }

    public Duenios(int id_documento_duenio, String nombre, String apellido, String telefono, String correo) {
        this.id_documento_duenio = id_documento_duenio;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
    }
    
    public Duenios(int id_duenio, int id_documento_duenio, String nombre, String apellido, String telefono, String correo) {
        this.id_duenio = id_duenio;
        this.id_documento_duenio = id_documento_duenio;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
    }
    
    /*public Duenios(int id_documento_cliente, String nombre, String apellido, String telefono, String correo, List<Mascotas> mascotas) {
        this.id_documento_cliente = id_documento_cliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.mascotas = mascotas;
    }*/

    public int getId_duenio() {
        return id_duenio;
    }

    public void setId_duenio(int id_duenio) {
        this.id_duenio = id_duenio;
    }

    public int getId_documento_duenio() {
        return id_documento_duenio;
    }

    public void setId_documento_duenio(int id_documento_duenio) {
        this.id_documento_duenio = id_documento_duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /*public List<Mascotas> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascotas> mascotas) {
        this.mascotas = mascotas;
    }*/

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.id_duenio;
        hash = 17 * hash + this.id_documento_duenio;
        hash = 17 * hash + Objects.hashCode(this.nombre);
        hash = 17 * hash + Objects.hashCode(this.apellido);
        hash = 17 * hash + Objects.hashCode(this.telefono);
        hash = 17 * hash + Objects.hashCode(this.correo);
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
        final Duenios other = (Duenios) obj;
        if (this.id_duenio != other.id_duenio) {
            return false;
        }
        if (this.id_documento_duenio != other.id_documento_duenio) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        return Objects.equals(this.correo, other.correo);
    }

    
    
    @Override
    public String toString() {
        return "Duenios{" + "id_duenio=" + id_duenio + ", id_documento_duenio=" + id_documento_duenio + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", correo=" + correo + '}';
    }
}
