package pckModele;

import java.util.ArrayList;
import java.util.List;

import pckMetier.Produit;

public class ProduitModele {
    private String        motClef;
    private List<Produit> listProduits = new ArrayList<Produit>();

    public ProduitModele() {

    }

    public String getMotClef() {
        return motClef;
    }

    public void setMotClef( String motClef ) {
        this.motClef = motClef;
    }

    public List<Produit> getListProduits() {
        return listProduits;
    }

    public void setListProduits( List<Produit> listProduits ) {
        this.listProduits = listProduits;
    }

}
