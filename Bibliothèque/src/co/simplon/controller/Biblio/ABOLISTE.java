package co.simplon.controller.Biblio;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.simplon.dao.Biblio.BIBLIO_DAO;
import co.simplon.dao.Biblio.DAO_BIBLIO_Context;
import co.simplon.model.Biblio.ABONNE;
import co.simplon.model.Biblio.LIVRE;

/**
 * Servlet implementation class ABOLISTE
 */
@WebServlet(urlPatterns ="/aboliste", loadOnStartup=1)
public class ABOLISTE extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private BIBLIO_DAO BiblioDao;
	
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		DAO_BIBLIO_Context daoBiblioContext = new DAO_BIBLIO_Context();
		this.BiblioDao = daoBiblioContext.getBiblioDao();
	}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ABOLISTE() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setAttribute("ListeAbonne", this.BiblioDao.lister1());
		request.setAttribute("ListeLivre", this.BiblioDao.lister());
	
		RequestDispatcher rs = request.getRequestDispatcher("WEB-INF/Vu/ListeAbo.jsp");
		System.out.println(request.getParameter("num_matricule"));
		
		if(request.getParameter("action") != null) {
			String actionRecord = request.getParameter("action");
			ABONNE sAbonne = new ABONNE();
			LIVRE lLivre = new LIVRE();
			
			switch(actionRecord) {
			case "update":request.setAttribute("modifNom", request.getParameter("nom"));
                          request.setAttribute("modifPrenom",request.getParameter("prenom"));
                          request.setAttribute("modifNum_matricule", request.getParameter("num_matricule"));
                          /*request.setAttribute("modifnum_Livre", request.getParameter("num_Livre"));
                          request.setAttribute("modifTitre_Livre", request.getParameter("titre_Livre"));*/
                          
           break;
			case"delete":
				String numéro = request.getParameter("num_matricule");
				/*String numlivre =request.getParameter("num_Livre");*/
				System.out.println(numéro);
				
				int num_Mat= Integer.parseInt(numéro);
				/*int num_Li=Integer.parseInt(numlivre);*/
			System.out.println(num_Mat);
			sAbonne.setNum_matricule(num_Mat);
			System.out.println(sAbonne);
			this.BiblioDao.supprimer(sAbonne);
			System.out.println("Effacer");
		/*  lLivre.setNum_Livre(num_Li);
			this.BiblioDao.supprimer(lLivre);*/
			break;
			}
		}
		
        rs.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ABONNE sAbonne = new ABONNE();
		String nom = request.getParameter("nom");
			sAbonne.setNom(nom);
			System.out.println(nom);
			String prenom =request.getParameter("prenom") ;
			sAbonne.setPrenom(prenom);
			/*String pays =request.getParameter("pays");
			sAbonne.setPays(pays);
			String téléphone = request.getParameter("téléphone");
			int tél= Integer.parseInt(téléphone);
			sAbonne.setTéléphone(tél);
			String livreRecherché = request.getParameter("Livre recherché");
			sAbonne.setLivre_Recherché(livreRecherché);
			String livreEmprunté = request.getParameter("Livre emprunté");
			sAbonne.setLivre_Emprunté(livreEmprunté);
			String catpro = request.getParameter("Catégorie pro");
			sAbonne.setCatégorie_pro(catpro);*/
			System.out.println(prenom);
			System.out.println(sAbonne); 
		
	LIVRE lLivre = new LIVRE();
		String titre_Livre = request.getParameter("titre_Livre");
		lLivre.setTitre_Livre(titre_Livre);
		System.out.println(titre_Livre);
	
		
		if(request.getParameter("num_matricule") != null && request.getParameter("num_matricule") != "") {
			sAbonne.setNum_matricule(Integer.parseInt(request.getParameter("num_matricule")));
			this.BiblioDao.modifier(sAbonne);
			System.out.println("Modifier");
		}else {
			
			
			
			
			System.out.println("Ajouter");
			this.BiblioDao.ajouter(sAbonne);
		
		
		}
		
		
		
		if(request.getParameter("num_Livre") != null && request.getParameter("num_Livre") != "" ) {
			lLivre.setNum_Livre(Integer.parseInt(request.getParameter("num_Livre")));
			this.BiblioDao.modifier(lLivre);
			System.out.println("Modifier Livre");
		}else {
			this.BiblioDao.ajouter(lLivre);
			System.out.println("Ajouter Livre");
		}
			
		request.setAttribute("ListeAbonne", this.BiblioDao.lister1());
		request.setAttribute("ListeLivre", this.BiblioDao.lister());
		RequestDispatcher rs = request.getRequestDispatcher("WEB-INF/Vu/ListeAbo.jsp");
        rs.forward(request, response);
	
	}

}
