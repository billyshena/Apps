package pckMetier;

import java.sql.SQLException;
import java.util.List;

public interface IMetier {
    public List<Produit> getProduitParMotClef( String motClef );

    public void addProduit( Produit p );

    public void supprimerProduit( Produit p );

    public List<Produit> getTousLesProduits();

    public Utilisateur getUtilisateurParPseudoEtMdp( String pseudo, String mdp );

    public void addUser( Utilisateur user ) throws SQLException;

}
