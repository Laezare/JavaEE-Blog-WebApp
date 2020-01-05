package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAOArticle;
import dao.DAOFactory;

/**
 * Servlet implementation class Post
 */
public class Post extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static int PostId = 0;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("PostButton") != null) {
			try {
				PostId = Integer.parseInt(request.getParameter("PostButton"));
			} catch (Exception e) {
			}

		}

		DAOFactory factory = new DAOFactory();
		DAOArticle daoArticle = factory.getDaoArticle();
		request.setAttribute("article", daoArticle.getArticle(PostId));
		this.getServletContext().getRequestDispatcher("/WEB-INF/Post.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
