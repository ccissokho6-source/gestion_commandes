package sn.edu.isepat.tic.dfe.p6;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import sn.edu.isepat.tic.dfe.p6.entities.Utilisateur;

public class TestAutoIncremente {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("gestionProduitsPU");
        EntityManager em= emf.createEntityManager();

        em.getTransaction().begin();
        Utilisateur u1=new Utilisateur();
        u1.setNom("Coumba Cissokho");
        u1.setEmail("coumba87@gmail.com");
        em.persist(u1);


        Utilisateur u2=new Utilisateur();
        u2.setNom("Niama Cissokho");
        u2.setEmail("mania20@gmail.com");
        em.persist(u2);
        em.getTransaction().commit();

        em.close();
        emf.close();

    }
}
