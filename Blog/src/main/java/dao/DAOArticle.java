package dao;

import java.util.List;
import model.Article;

public interface DAOArticle {
	public Article getArticle(int id);
	public List<Article> getAllArticles();
	public void AddArticle(Article article);
	public void updateArticle(Article article);
	public void deleteArticle(Article article);
	public List<Article> getAllAuthors();
	public List<Article> getLastArticles();
}
