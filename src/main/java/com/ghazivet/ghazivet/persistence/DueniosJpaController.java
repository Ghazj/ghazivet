package com.ghazivet.ghazivet.persistence;

import com.ghazivet.ghazivet.logica.Duenios;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DueniosJpaController implements Serializable {

    EntityManagerFactory emf = null;

    public DueniosJpaController() {
        this.emf = Persistence.createEntityManagerFactory("GhaziVetPU");
    }

    public DueniosJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public void persist(Object object) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Duenios duenio) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(duenio);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Object id, Duenios newDuenio) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Duenios Duenio = em.find(Duenios.class, id);
            Duenio.setId_documento_duenio(newDuenio.getId_documento_duenio());
            Duenio.setNombre(newDuenio.getNombre());
            Duenio.setApellido(newDuenio.getApellido());
            Duenio.setTelefono(newDuenio.getTelefono());
            Duenio.setCorreo(newDuenio.getCorreo());
            em.merge(Duenio);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void remove(Object id, Class<Entity> entityClass) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Entity entity = em.find(entityClass, id);
            em.remove(entity);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public Duenios find(Object id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Duenios.class, id);
        } finally {
            em.close();
        }
    }

    public Duenios find(Object id, Class<Duenios> Duenios) {
        System.out.println(id);
        EntityManager em = getEntityManager();
        try {
            return em.find(Duenios, id);
        } finally {
            em.close();
        }
    }

    public List<Duenios> findAll() {
        EntityManager em = getEntityManager();
        try {
            return em.createQuery("SELECT e FROM Duenios e").getResultList();
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

    public List<Entity> findRange(int[] range, Class<Entity> entityClass) {
        EntityManager em = getEntityManager();
        try {
            return em.createQuery("SELECT e FROM " + entityClass.getSimpleName() + " e")
                    .setFirstResult(range[0])
                    .setMaxResults(range[1] - range[0] + 1)
                    .getResultList();
        } finally {
            em.close();
        }
    }

    public int count(Class<Entity> entityClass) {
        EntityManager em = getEntityManager();
        try {
            return ((Number) em.createQuery("SELECT COUNT(e) FROM " + entityClass.getSimpleName() + " e")
                    .getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    public void close() {
        if (emf != null) {
            emf.close();
        }
    }
}
