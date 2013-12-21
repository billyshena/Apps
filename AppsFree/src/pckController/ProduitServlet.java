package pckController;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pckMetier.IMetier;
import pckMetier.MetierImplement;
import pckMetier.Produit;
import pckModele.ProduitModele;

public class ProduitServlet extends HttpServlet {

    /**
     * 
     */
    private static final long   serialVersionUID = 1L;
    private static final String VUE              = "/WEB-INF/produit.jsp";
    private IMetier    metier;

    @Override
    public void init() throws ServletException {
        metier = new MetierImplement();
    }

    @Override
    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        String motClef = request.getParameter( "motClef" );
        ProduitModele modele = new ProduitModele();
        modele.setMotClef( motClef );
        List<Produit> listProduit = metier.getProduitParMotClef( motClef );
        modele.setListProduits( listProduit );
        request.setAttribute( "modele", modele );
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );

    }

    public void doGet( HttpServletRequest request, HttpServletResponse
            response ) throws ServletException, IOException {

        this.doPost( request, response );

    }

}
