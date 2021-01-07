package co.simplon.dao.Biblio;

import java.sql.*;

import javax.servlet.ServletContext;

public class DAO_BIBLIO_Context {
	
	public static Connection getConnection() throws SQLException{
		String protocol =  "jdbc:";
		String sous_protocol = "mysql://";
		String ip = "localhost:3306/";
		String bd = "TDBiblio";
		String paramètre = "?useSSL=false&serverTimezone=Europe/Paris";
		String login = "root";
		String password = "Dissidia12!";
		String url = protocol+sous_protocol+ip+bd+paramètre;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		Connection connexion = DriverManager.getConnection(url,login,password);
		System.out.println("success");
		return connexion;
		
	}
	
	public BIBLIO_DAO getBiblioDao() {
		return new BIBLIODAOImpl(this);
	}

	public void init(ServletContext servletContext) {
		// TODO Auto-generated method stub
		
	}

}
