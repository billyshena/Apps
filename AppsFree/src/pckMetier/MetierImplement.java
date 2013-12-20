package pckMetier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MetierImplement implements IMetierCatalogue {

    @Override
    public List<Produit> getProduitParMotClef( String motClef ) {
        List<Produit> listProduits = new ArrayList<Produit>();
        Connection connection = SingletonConnexion.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement( "select * from produit where nomProduit like ?" );
            ps.setString( 1, "%" + motClef + "%" );
            ResultSet rs = ps.executeQuery();
            while ( rs.next() ) {
                Produit p = new Produit();
                p.setIdProduit( rs.getLong( "idProduit" ) );
                p.setNomProduit( rs.getString( "nomProduit" ) );
                p.setPrixProduit( rs.getDouble( "prixProduit" ) );
                listProduits.add( p );
            }

            return listProduits;

        } catch ( Exception e ) {
            // TODO Auto-generated catch block
            System.err.println( "Erreur mon pote : " + e.getMessage() );
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public void addProduit( Produit p ) {
        // TODO Auto-generated method stub

    }

    @Override
    public void supprimerProduit( Produit p ) {
        // TODO Auto-generated method stub

    }

    public List<Produit> getTousLesProduits() {
        List<Produit> listProduits = new ArrayList<Produit>();
        Connection connection = SingletonConnexion.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement( "select * from produit " );
            ResultSet rs = ps.executeQuery();
            while ( rs.next() ) {
                Produit p = new Produit();
                p.setIdProduit( rs.getLong( "idProduit" ) );
                p.setNomProduit( rs.getString( "nomProduit" ) );
                p.setPrixProduit( rs.getDouble( "prixProduit" ) );
                listProduits.add( p );
            }

            return listProduits;

        } catch ( Exception e ) {
            // TODO Auto-generated catch block
            System.err.println( "Erreur mon pote : " + e.getMessage() );
            e.printStackTrace();
            return null;
        }

    }

}
