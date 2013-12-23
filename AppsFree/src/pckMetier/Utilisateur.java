package pckMetier;

import java.io.Serializable;

public class Utilisateur implements Serializable {
    private Long   idUtilisateur;
    private String nom;
    private String prenom;
    private String website;
    private String pseudo;
    private String password;
    private String email;

    public Utilisateur() {
        this.idUtilisateur = null;
        this.nom = "";
        this.prenom = "";
        this.website = "";
        this.pseudo = "";
        this.password = "";
        this.email = "";
    }

    public Long getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur( Long idUtilisateur ) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom( String nom ) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom( String prenom ) {
        this.prenom = prenom;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite( String website ) {
        this.website = website;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo( String pseudo ) {
        this.pseudo = pseudo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword( String password ) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail( String email ) {
        this.email = email;
    }

}
