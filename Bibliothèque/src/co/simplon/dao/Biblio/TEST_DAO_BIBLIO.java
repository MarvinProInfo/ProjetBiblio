package co.simplon.dao.Biblio;

import java.sql.*;

import co.simplon.model.Biblio.ABONNE;
import co.simplon.dao.Biblio.*;
public class TEST_DAO_BIBLIO {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
	
		String protocol =  "jdbc:";
		String sous_protocol = "mysql://";
		String ip = "localhost:3306/";
		String bd = "TDBiblio";
		String paramètre = "?useSSL=false&serverTimezone=Europe/Paris";
		String login = "root";
		String password = "Dissidia12!";
		String url = protocol+sous_protocol+ip+bd+paramètre;
		
		
		
		
		Connection connexion = DriverManager.getConnection(url,login,password);
		System.out.println("success");
		return;
		
}

}