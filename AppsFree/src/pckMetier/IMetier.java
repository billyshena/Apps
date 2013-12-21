package pckMetier;

import java.util.List;

public interface IMetier {
    public List<Produit> getProduitParMotClef( String motClef );

    public void addProduit( Produit p );

    public void supprimerProduit( Produit p );

    public List<Produit> getTousLesProduits();

    public Utilisateur getUtilisateurParPseudoEtMdp( String pseudo, String mdp );

}
