package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAOArticle;
import dao.DAOFactory;
import model.Article;

/**
 * Servlet implementation class PostsList
 */
public class PostsList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PostsList() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		DAOFactory factory = new DAOFactory();
		DAOArticle daoArticle = factory.getDaoArticle();
		request.setAttribute("articles", daoArticle.getAllArticles());
		this.getServletContext().getRequestDispatcher("/WEB-INF/PostsList.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		DAOFactory factory = new DAOFactory();
		DAOArticle daoArticle = factory.getDaoArticle();
		if (request.getParameter("Supprimer") != null) {

			Article delArticle = new Article();
			delArticle.setId(Integer.parseInt(request.getParameter("Supprimer")));
			daoArticle.deleteArticle(delArticle);
		}
		request.setAttribute("articles", daoArticle.getAllArticles());
		request.getRequestDispatcher("/WEB-INF/PostsList.jsp").forward(request, response);
	}

}
