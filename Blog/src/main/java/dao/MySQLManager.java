package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLManager {

	private static MySQLManager instance;

	@SuppressWarnings("unused")
	private Statement statement;
	private Connection connection;
	private String url = "jdbc:mysql://localhost:3306/blog?serverTimezone=Europe/Paris";
	private String utilisateur = "root";
	private String motDePasse = "";

	public Connection getConnection() {
		return connection;
	}

	public static synchronized MySQLManager getInstance() {
		if (instance == null) {
			instance = new MySQLManager();
		}
		return instance;
	}

	private MySQLManager() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.connection = DriverManager.getConnection(url, utilisateur, motDePasse);
			this.statement = this.connection.createStatement();
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
