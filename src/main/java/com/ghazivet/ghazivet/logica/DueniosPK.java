package com.ghazivet.ghazivet.logica;

import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class DueniosPK {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_duenio;
    @Id
    private int id_documento_duenio;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;

    /*@ManyToMany
    private List<Mascotas> mascotas;*/

    public DueniosPK() {
    }

    public DueniosPK(int id_documento_duenio, String nombre, String apellido, String telefono, String correo) {
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
    public String toString() {
        return "Duenios{" + "id_duenio=" + id_duenio + ", id_documento_duenio=" + id_documento_duenio + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", correo=" + correo + '}';
    }
}
