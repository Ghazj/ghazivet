package com.ghazivet.ghazivet.persistence;

import com.ghazivet.ghazivet.logica.Duenios;
import com.ghazivet.ghazivet.logica.Especies;
import com.ghazivet.ghazivet.logica.Generos;
import com.ghazivet.ghazivet.logica.Mascotas;
import java.util.List;

public class PersistenceController {

    DueniosJpaController DueniosJpaController = new DueniosJpaController();
    MascotasJpaController MascotasJpaController = new MascotasJpaController();
    GenerosJpaController GenerosJpaController = new GenerosJpaController();
    EspeciesJpaController EspeciesJpaController = new EspeciesJpaController();

    public void saveDuenio(Duenios Duenio) {
        DueniosJpaController.create(Duenio);
    }

    public Duenios getDuenio(int idDuenio) {
        return DueniosJpaController.find(idDuenio, Duenios.class);
    }

    public List<Duenios> getDuenios() {
        return DueniosJpaController.findAll();
    }

    public void editDuenio(int idDuenio, Duenios Duenio) {
        DueniosJpaController.edit(idDuenio, Duenio);
    }

    public List<Mascotas> getMascotasDuenio(int idDuenio) {
        return MascotasJpaController.findAllByDuenio(idDuenio);
    }

    public Especies getEspecie(int idEspecie) {
        return EspeciesJpaController.find(idEspecie);
    }

    public Generos getGenero(int idGenero) {
        return GenerosJpaController.find(idGenero);
    }

    public void saveMascota(Mascotas Mascota) {
        MascotasJpaController.create(Mascota);
    }

    public List<Especies> getEspecies() {
        return EspeciesJpaController.findAll();
    }

    public List<Generos> getGeneros() {
        return GenerosJpaController.findAll();
    }
}
