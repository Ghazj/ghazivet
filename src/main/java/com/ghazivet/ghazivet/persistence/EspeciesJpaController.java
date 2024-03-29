package com.ghazivet.ghazivet.persistence;

import com.ghazivet.ghazivet.logica.Especies;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EspeciesJpaController {

    EntityManagerFactory emf = null;

    public EspeciesJpaController() {
        this.emf = Persistence.createEntityManagerFactory("GhaziVetPU");
    }

    public EspeciesJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public Especies find(Object idEspecie) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Especies.class, idEspecie);
        } finally {
            em.close();
        }
    }

    List<Especies> findAll() {
        EntityManager em = getEntityManager();
        try {
            return em.createQuery("SELECT e FROM Especies e").getResultList();
        } finally {
            em.close();
        }
    }
}
