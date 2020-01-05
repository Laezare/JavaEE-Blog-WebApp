package bootstrap;

import dao.DAOArticle;
import dao.DAOFactory;

public class Bootstrap {

	public static void main(String[] args) {
		DAOFactory factory = new DAOFactory();
		DAOArticle daoArticle = factory.getDaoArticle();
		System.out.println(daoArticle.getArticle(1));
		System.out.println(daoArticle.getArticle(1).getAuteur());
		System.out.println(daoArticle.getAllArticles());
		System.out.println(daoArticle);
		
		/*
		Article newArticle = new Article();
		
		newArticle.setTitre("2nd article");
		newArticle.setAuteur("Krepa");
		newArticle.setDate(Date.valueOf(LocalDate.now()));
		newArticle.setDescription("a short description");
		newArticle.setTexte("A really interesting text");
		daoArticle.AddArticle(newArticle);
		
		System.out.println(daoArticle.getAllArticles());
		*/
		/*
		//create Tom
		User userT = new User();
		
		
		userT.setFirstname("Krepa");
		userT.setSurname("Tom");
		userT.setPassword("Parrot");
		userT.setMail("tom.krepa@ynov.com");
		daoUser.AddUser(userT);
		
		//Update Yaya
		User userY = new User();

		userY.setId(3);
		userY.setFirstname("Yanis");
		userY.setSurname("Dj");
		userY.setPassword("LaTaupe");
		userY.setMail("yanis.dj@ynov.com");
		daoUser.updateUser(userY);
		
		//print list
		System.out.println(daoUser.getAllUsers());
		System.out.println("Récuperation de l'utilisateur et affichage");
		User generatedUser = daoUser.getUser(userT.getId());
		System.out.println(generatedUser);
		
		//Delete
		daoUser.deleteUser(userT);
		generatedUser = daoUser.getUser(userT.getId());
		System.out.println(generatedUser);
		*/
	}

}
