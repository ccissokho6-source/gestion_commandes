package sn.edu.isepat.tic.dfe.p6.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Permet d'auto incrementer
    private Integer id ;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false,unique = true, length = 50)
    private String email ;

    @OneToOne(cascade = CascadeType.ALL)
    private Profil profil;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Profil getProfil() {
        return profil;
    }

    public void setProfil(Profil profil) {
        this.profil = profil;
    }
}