package br.com.sis.beans.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAO {

    private static final EntityManagerFactory emf
            = Persistence.createEntityManagerFactory("sistemas");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
}
