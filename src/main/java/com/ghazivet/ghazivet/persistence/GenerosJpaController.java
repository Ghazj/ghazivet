package com.ghazivet.ghazivet.persistence;

import com.ghazivet.ghazivet.logica.Especies;
import com.ghazivet.ghazivet.logica.Generos;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GenerosJpaController {

    EntityManagerFactory emf = null;

    public GenerosJpaController() {
        this.emf = Persistence.createEntityManagerFactory("GhaziVetPU");
    }

    public GenerosJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public Generos find(Object idGenero) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Generos.class, idGenero);
        } finally {
            em.close();
        }
    }

    List<Generos> findAll() {
        EntityManager em = getEntityManager();
        try {
            return em.createQuery("SELECT g FROM Generos g").getResultList();
        } finally {
            em.close();
        }
    }
}
