package com.ghazivet.ghazivet.persistence;

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
}
