package servlets;

import java.io.IOException;

import java.sql.Date;
import java.time.LocalDate;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAOArticle;
import dao.DAOFactory;
import model.Article;

/**
 * Servlet implementation class CreatePost
 */
public class CreatePost extends HttpServlet {
	public static final String CHAMP_AUTEUR = "auteur";
	public static final String CHAMP_TITRE = "titre";
	public static final String CHAMP_DESCRIPTION = "description";
	public static final String CHAMP_TEXTE = "texte";
	public static final String ATT_RESULTAT = "resultat";
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/CreatePost.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Recupération des champs
		String auteur = request.getParameter(CHAMP_AUTEUR);
		String titre = request.getParameter(CHAMP_TITRE);
		String description = request.getParameter(CHAMP_DESCRIPTION);
		String texte = request.getParameter(CHAMP_TEXTE);
		
		if (auteur == "") {
			auteur = "anonyme";
		}
		if (titre == "") {
			titre = "no title";
		}
		if (description == "") {
			description = "no description";
		}
		if (texte == "") {
			texte = "no text";
		}

		// Validation des champs

		DAOFactory factory = new DAOFactory();
		DAOArticle daoArticle = factory.getDaoArticle();

		Article newArticle = new Article();

		try {
			newArticle.setAuteur(auteur);
			newArticle.setTitre(titre);
			newArticle.setDescription(description);
			newArticle.setTexte(texte);
			newArticle.setDate(Date.valueOf(LocalDate.now()));
		} catch (Exception e) {
		}
		daoArticle.AddArticle(newArticle);

		// Stockage du résultat et des messages d'erreur dans l'objet request
		request.setAttribute(ATT_RESULTAT, "Votre poste a bien été enregistré");

		// Transmission de la paire d'objets request/response à notre JSP
		this.getServletContext().getRequestDispatcher("/WEB-INF/CreatePost.jsp").forward(request, response);

	}
}
