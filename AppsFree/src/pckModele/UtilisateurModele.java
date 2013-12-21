package pckModele;

import pckMetier.Utilisateur;

public class UtilisateurModele {
    private String      pseudo;
    private Utilisateur user;

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo( String pseudo ) {
        this.pseudo = pseudo;
    }

    public Utilisateur getUser() {
        return user;
    }

    public void setUser( Utilisateur user ) {
        this.user = user;
    }

}
