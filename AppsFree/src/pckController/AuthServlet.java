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
import pckModele.UtilisateurModele;

public class AuthServlet extends HttpServlet {
    private static final String VUE = "/WEB-INF/auth.jsp";

    private IMetier             metier;

    @Override
    public void init() throws ServletException {
        metier = new MetierImplement();
    }

    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        HttpSession session = request.getSession( true );
        UtilisateurModele modele = new UtilisateurModele();
        String pseudo = request.getParameter( "userPseudo" );
        String mdp = request.getParameter( "userPassword" );
        Utilisateur user = metier.getUtilisateurParPseudoEtMdp( pseudo, mdp );
        if ( user != null ) {
            modele.setPseudo( pseudo );
            modele.setUser( user );
            session.setAttribute( "pseudo", user.getPseudo() );
            session.setAttribute( "user", user );
            this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
        }
        else {
            String message = "Pseudo ou mot de passe incorrect";
            request.setAttribute( "message", message );
            this.getServletContext().getRequestDispatcher( "/WEB-INF/login.jsp" ).forward( request, response );
        }

    }

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        this.doPost( request, response );
    }

}
