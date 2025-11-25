package sn.edu.isepat.tic.dfe.p6;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import sn.edu.isepat.tic.dfe.p6.entities.Profil;
import sn.edu.isepat.tic.dfe.p6.entities.Utilisateur;

public class TestAutoIncremente {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("gestionProduitsPU");
        EntityManager em= emf.createEntityManager();

        em.getTransaction().begin();
        Utilisateur u1=new Utilisateur();
        u1.setNom("Coumba Cissokho");
        u1.setEmail("coumba87@gmail.com");

        Profil p1= new Profil();
        p1.setBio("Directrice");
        p1.setTelephone("772455550");
        p1.setPhoto("coumba.jpg");

        u1.setProfil(p1);
//        em.persist(p1);// quand on enregistre u1 on a plus besoin d'enregistrer le profil( relation CascadeType.ALL)
        em.persist(u1);


        Utilisateur u2=new Utilisateur();
        u2.setNom("Niama Cissokho");
        u2.setEmail("mania20@gmail.com");
        em.persist(u2);

        em.remove(u1);// supprime l'entite dans la base
        em.getTransaction().commit();



        em.close();
        emf.close();

    }
}
