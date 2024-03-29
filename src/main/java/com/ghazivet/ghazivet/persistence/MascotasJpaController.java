package com.ghazivet.ghazivet.persistence;

import com.ghazivet.ghazivet.logica.Duenios;
import com.ghazivet.ghazivet.logica.Mascotas;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MascotasJpaController {

    EntityManagerFactory emf = null;

    public MascotasJpaController() {
        this.emf = Persistence.createEntityManagerFactory("GhaziVetPU");
    }

    public MascotasJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public Mascotas find(Object id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Mascotas.class, id);
        } finally {
            em.close();
        }
    }

    public Mascotas find(Object id, Class<Mascotas> Mascotas) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Mascotas, id);
        } finally {
            em.close();
        }
    }

    public List<Mascotas> findAll() {
        EntityManager em = getEntityManager();
        try {
            return em.createQuery("SELECT m FROM Mascotas m").getResultList();
        } finally {
            em.close();
        }
    }

    public List<Duenios> findAll(Class<Duenios> entityClass) {
        EntityManager em = getEntityManager();
        try {
            return em.createQuery("SELECT e FROM " + entityClass.getSimpleName() + " e", entityClass).getResultList();
        } finally {
            em.close();
        }
    }

    public List<Mascotas> findAllByDuenio(Object id) {
        EntityManager em = getEntityManager();
        try {
            return em.createQuery("SELECT m FROM Mascotas m WHERE m.duenio.id_duenio = " + id, Mascotas.class).getResultList();
        } finally {
            em.close();
        }
    }

    void create(Mascotas Mascota) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(Mascota);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
}
