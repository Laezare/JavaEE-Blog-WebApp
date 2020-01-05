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
public class UpdatePost extends HttpServlet {
	public static final String CHAMP_AUTEUR = "auteur";
	public static final String CHAMP_TITRE = "titre";
	public static final String CHAMP_DESCRIPTION = "description";
	public static final String CHAMP_TEXTE = "texte";
	public static final String ATT_RESULTAT = "resultat";
	private static final long serialVersionUID = 1L;
	public static int Post_Id = 0;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println(request.getParameter("Modifier"));
		if (request.getParameter("Modifier") != null) {
			try {
				Post_Id = Integer.parseInt(request.getParameter("Modifier"));
				request.setAttribute("modifier", request.getParameter("Modifier"));
			} catch (Exception e) {
			}

		}
		this.getServletContext().getRequestDispatcher("/WEB-INF/UpdatePost.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("modifier") != null) {
			try {
				Post_Id = Integer.parseInt(request.getParameter("modifier"));
			} catch (Exception e) {
			}

		}
		// Recupération des champs
		String auteur = request.getParameter(CHAMP_AUTEUR);
		String titre = request.getParameter(CHAMP_TITRE);
		String description = request.getParameter(CHAMP_DESCRIPTION);
		String texte = request.getParameter(CHAMP_TEXTE);

		// Validation des champs
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

		DAOFactory factory = new DAOFactory();
		DAOArticle daoArticle = factory.getDaoArticle();

		Article updArticle = new Article();

		try {
			updArticle.setId(Post_Id);
			updArticle.setAuteur(auteur);
			updArticle.setTitre(titre);
			updArticle.setDescription(description);
			updArticle.setTexte(texte);
			updArticle.setDate(Date.valueOf(LocalDate.now()));
		} catch (Exception e) {
		}
		daoArticle.updateArticle(updArticle);

		// Stockage du résultat et des messages d'erreur dans l'objet request
		request.setAttribute(ATT_RESULTAT, "Votre poste a bien été modifié");

		// Transmission de la paire d'objets request/response à notre JSP
		this.getServletContext().getRequestDispatcher("/WEB-INF/UpdatePost.jsp").forward(request, response);

	}
}
