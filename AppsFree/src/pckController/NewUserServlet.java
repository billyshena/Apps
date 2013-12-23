package pckController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pckMetier.IMetier;
import pckMetier.MetierImplement;
import pckMetier.Utilisateur;

public class NewUserServlet extends HttpServlet {
    private final static String VUE = "/WEB-INF/newUser.jsp";

    private IMetier             metier;

    @Override
    public void init() throws ServletException {
        metier = new MetierImplement();
    }

    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        // Récupération des paramètre
        String prenom = request.getParameter( "userPrenom" );
        String nom = request.getParameter( "userNom" );
        String website = request.getParameter( "userWebsite" );
        String pseudo = request.getParameter( "userPseudo" );
        String email = request.getParameter( "userEmail" );
        String mdp = request.getParameter( "userPassword" );
        Utilisateur user = new Utilisateur();
        user.setIdUtilisateur( null );
        user.setPrenom( prenom );
        user.setNom( nom );
        user.setWebsite( website );
        user.setPseudo( pseudo );
        user.setEmail( email );
        user.setPassword( mdp );
        if ( user.getPseudo() != "" && user.getPassword() != "" && user.getEmail() != "" ) {
            try {
                HttpSession session = request.getSession( true );
                metier.addUser( user );
                session.setAttribute( "utilisateur", user );
                this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
            } catch ( Exception e ) {
            }
        } else {
            String msgError = "Le pseudo, le mot de passe et l'email doivent être rempli";
            request.setAttribute( "errorMessage", msgError );
            this.getServletContext().getRequestDispatcher( "/WEB-INF/register.jsp" ).forward( request, response );
        }

    }

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        this.doPost( request, response );
    }

}
