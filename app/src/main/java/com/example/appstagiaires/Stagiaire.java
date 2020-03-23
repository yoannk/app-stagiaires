package com.example.appstagiaires;

import java.io.Serializable;

public class Stagiaire implements Serializable {

    public static final String EXTRA_STAGIAIRE = "com.example.appstagiaires.STAGIAIRE";

    private final String nom;
    private final String prenom;
    private final String adresse;
    private final String telephone;
    private final String email;
    private final String photo;

    public Stagiaire(String nom, String prenom, String adresse, String telephone, String email, String photo) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.email = email;
        this.photo = photo;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoto() {
        return photo;
    }
}
