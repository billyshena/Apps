package pckMetier;

import java.io.Serializable;

public class Produit implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Long              idProduit;
    private String            nomProduit;
    private double            prixProduit;

    public Produit() {
        this.idProduit = null;
        this.nomProduit = "";
        this.prixProduit = 0;
    }

    public Produit( String nomProduit, double prixProduit ) {
        super();
        this.nomProduit = nomProduit;
        this.prixProduit = prixProduit;
    }

    public Long getIdProduit() {
        return idProduit;
    }

    public void setIdProduit( Long idProduit ) {
        this.idProduit = idProduit;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit( String nomProduit ) {
        this.nomProduit = nomProduit;
    }

    public double getPrixProduit() {
        return prixProduit;
    }

    public void setPrixProduit( double prixProduit ) {
        this.prixProduit = prixProduit;
    }

}
