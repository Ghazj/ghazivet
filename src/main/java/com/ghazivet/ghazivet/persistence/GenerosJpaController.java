package com.ghazivet.ghazivet.persistence;

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
}
