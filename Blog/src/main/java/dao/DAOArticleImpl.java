package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Article;

public class DAOArticleImpl implements DAOArticle {

	private Connection connection;

	public DAOArticleImpl(Connection setConnection) {
		this.connection = setConnection;
	}

	public Article getArticle(int id) {

		Article article = new Article();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM articles WHERE id = ?");
			preparedStatement.setInt(1, id);
			ResultSet resultat = preparedStatement.executeQuery();

			if (resultat.next() == false) {
				return null;
			} else {
				do {
					article.setAuteur(resultat.getString("auteur"));
					article.setTitre(resultat.getString("titre"));
					article.setDescription(resultat.getString("description"));
					article.setTexte(resultat.getString("texte"));
					article.setDate(resultat.getDate("date"));
				} while (resultat.next());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return article;
	}

	public List<Article> getAllArticles() {
		List<Article> articles = new ArrayList<Article>();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM articles");
			ResultSet resultat = preparedStatement.executeQuery();

			while (resultat.next()) {
				Article article = new Article();
				article.setId(resultat.getInt("id"));
				article.setAuteur(resultat.getString("auteur"));
				article.setTitre(resultat.getString("titre"));
				article.setDescription(resultat.getString("description"));
				article.setTexte(resultat.getString("texte"));
				article.setDate(resultat.getDate("date"));
				articles.add(article);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return articles;
	}

	public void AddArticle(Article article) {
		try {
			String query = "INSERT INTO articles(auteur, titre, description, texte, date) VALUES (?,?,?,?,?)";
			String generatedColumns[] = { "ID" };
			PreparedStatement preparedStatement = connection.prepareStatement(query, generatedColumns);
			preparedStatement.setString(1, article.getAuteur());
			preparedStatement.setString(2, article.getTitre());
			preparedStatement.setString(3, article.getDescription());
			preparedStatement.setString(4, article.getTexte());
			preparedStatement.setDate(5, article.getDate());
			preparedStatement.executeUpdate();

			ResultSet rs = preparedStatement.getGeneratedKeys();
			while (rs.next()) {
				article.setId(rs.getInt(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void updateArticle(Article article) {
		{
			try {
				PreparedStatement preparedStatement = connection.prepareStatement(
						"UPDATE articles SET auteur = ?, titre = ? , description = ?, texte = ?, date = ? WHERE id = ?");

				preparedStatement.setString(1, article.getAuteur());
				preparedStatement.setString(2, article.getTitre());
				preparedStatement.setString(3, article.getDescription());
				preparedStatement.setString(4, article.getTexte());
				preparedStatement.setDate(5, article.getDate());
				preparedStatement.setInt(6, article.getId());
				preparedStatement.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public void deleteArticle(Article article) {
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("delete FROM articles WHERE id = ?");
			preparedStatement.setInt(1, article.getId());
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Article> getAllAuthors() {
		List<Article> articles = new ArrayList<Article>();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM articles ORDER BY auteur");
			ResultSet resultat = preparedStatement.executeQuery();

			while (resultat.next()) {
				Article article = new Article();
				article.setId(resultat.getInt("id"));
				article.setAuteur(resultat.getString("auteur"));
				article.setTitre(resultat.getString("titre"));
				article.setDescription(resultat.getString("description"));
				article.setTexte(resultat.getString("texte"));
				article.setDate(resultat.getDate("date"));
				articles.add(article);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return articles;
	}
	
	public List<Article> getLastArticles() {
		List<Article> articles = new ArrayList<Article>();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM articles ORDER BY ID DESC LIMIT 2");
			ResultSet resultat = preparedStatement.executeQuery();

			while (resultat.next()) {
				Article article = new Article();
				article.setId(resultat.getInt("id"));
				article.setAuteur(resultat.getString("auteur"));
				article.setTitre(resultat.getString("titre"));
				article.setDescription(resultat.getString("description"));
				article.setTexte(resultat.getString("texte"));
				article.setDate(resultat.getDate("date"));
				articles.add(article);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return articles;
	}

}
