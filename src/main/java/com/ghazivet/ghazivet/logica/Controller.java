package com.ghazivet.ghazivet.logica;

import com.ghazivet.ghazivet.persistence.PersistenceController;
import java.util.List;

public class Controller {
    private PersistenceController PersistenceController = new PersistenceController();

    public Controller() {
    }

    public void saveDuenio(String idDocumentoDuenio, String nombreDuenio, String apellidoDuenio, String telefonoDuenio, String correoDuenio) {
        int documentoDuenioInt = Integer.parseInt(idDocumentoDuenio);

        Duenios Duenio = new Duenios(documentoDuenioInt, nombreDuenio, apellidoDuenio, telefonoDuenio, correoDuenio);
        PersistenceController.saveDuenio(Duenio);
    }

    public Duenios getDuenio(int idDuenio) {
        return PersistenceController.getDuenio(idDuenio);
    }

    public List<Duenios> getDuenios() {
        return PersistenceController.getDuenios();
    }

    public void editDuenio(int idDuenio, String newIdDocumentoDuenio, String nombreDuenio, String apellidoDuenio, String telefonoDuenio, String correoDuenio) {
        Duenios Duenio = getDuenio(idDuenio);
        System.out.println("Old dueño: " + Duenio.toString());

        Duenio.setId_documento_duenio(Integer.parseInt(newIdDocumentoDuenio));
        Duenio.setNombre(nombreDuenio);
        Duenio.setApellido(apellidoDuenio);
        Duenio.setTelefono(telefonoDuenio);
        Duenio.setCorreo(correoDuenio);
        System.out.println("New dueño: " + Duenio.toString());
        PersistenceController.editDuenio(idDuenio, Duenio);
    }
    
    public List<Mascotas> getMascotasDuenio(int idDuenio){
        return PersistenceController.getMascotasDuenio(idDuenio);
    }
}