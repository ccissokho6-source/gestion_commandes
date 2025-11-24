package sn.edu.isepat.tic.dfe.p6.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Permet d'auto incrementer
    private Long id ;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false,unique = true)
    private String email ;

}