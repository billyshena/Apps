package pckController;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pckMetier.IMetierCatalogue;
import pckMetier.MetierImplement;
import pckMetier.Produit;
import pckModele.ProduitModele;

public class CatalogueServlet extends HttpServlet {
    private static final String VUE = "/WEB-INF/catalogue.jsp";
    private IMetierCatalogue    metier;

    @Override
    public void init() throws ServletException {
        metier = new MetierImplement();
    }

    @Override
    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        ProduitModele modele = new ProduitModele();
        List<Produit> listProduit = metier.getTousLesProduits();
        modele.setListProduits( listProduit );
        request.setAttribute( "modele", modele );
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );

    }

    public void doGet( HttpServletRequest request, HttpServletResponse
            response ) throws ServletException, IOException {

        this.doPost( request, response );

    }

}
