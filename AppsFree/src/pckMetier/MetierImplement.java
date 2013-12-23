package pckMetier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MetierImplement implements IMetier {

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

    @Override
    public Utilisateur getUtilisateurParPseudoEtMdp( String pseudo, String mdp ) {
        Connection connection = SingletonConnexion.getConnection();
        try {

            PreparedStatement ps = connection
                    .prepareStatement( "select * from utilisateur;" );
            // ps.setString( 1, pseudo );
            // ps.setString( 2, mdp );
            ResultSet rs = ps.executeQuery();
            while ( rs.next() ) {
                if ( rs.getString( "pseudo" ).equals( pseudo ) && rs.getString( "mdp" ).equals( mdp ) ) {
                    Utilisateur user = new Utilisateur();
                    user.setPseudo( rs.getString( "pseudo" ) );
                    user.setPassword( rs.getString( "mdp" ) );
                    user.setPrenom( "lol" );
                    return user;
                }
            }

            return null;

        } catch ( Exception e ) {
            // TODO Auto-generated catch block
            System.err.println( "Erreur mon pote : " + e.getMessage() );
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void addUser( Utilisateur user ) throws SQLException {
        Connection connection = SingletonConnexion.getConnection();
        try {
            String query = "INSERT INTO Utilisateur( pseudo, mdp, email, nom, prenom, website) VALUES(?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement( query );
            ps.setString( 1, user.getPseudo() );
            ps.setString( 2, user.getPassword() );
            ps.setString( 3, user.getEmail() );
            ps.setString( 4, user.getNom() );
            ps.setString( 5, user.getPrenom() );
            ps.setString( 6, user.getWebsite() );
            ps.executeUpdate();
        } catch ( Exception e ) {
            // TODO Auto-generated catch block
            System.err.println( "Erreur mon pote : " + e.getMessage() );
            e.printStackTrace();
        }

    }
}
