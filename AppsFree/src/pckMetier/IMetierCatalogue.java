package pckMetier;

import java.util.List;

public interface IMetierCatalogue {
    public List<Produit> getProduitParMotClef( String motClef );

    public void addProduit( Produit p );

    public void supprimerProduit( Produit p );

    public List<Produit> getTousLesProduits();

}
