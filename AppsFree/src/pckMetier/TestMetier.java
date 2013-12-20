package pckMetier;

import java.util.List;

public class TestMetier {

    public static void main( String[] args ) {
        MetierImplement metier = new MetierImplement();
        List<Produit> listProduit = metier.getProduitParMotClef( "h" );
        for ( Produit prod : listProduit ) {
            System.out.println( "Nom : " + prod.getNomProduit() );
        }

        List<Produit> listProduit2 = metier.getTousLesProduits();
        for ( Produit prod : listProduit2 ) {
            System.out.println( "Nom : " + prod.getNomProduit() );
        }

    }
}
