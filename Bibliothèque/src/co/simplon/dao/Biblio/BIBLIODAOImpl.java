package co.simplon.dao.Biblio;

import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

import java.sql.*;
import java.time.LocalDate;

import co.simplon.model.Biblio.*;


/*OBJ : implementer interface BIBLIODAO + communiquer avec BDD*/

public class BIBLIODAOImpl implements BIBLIO_DAO {

	private DAO_BIBLIO_Context dao_BIBLIO_Context;

	public BIBLIODAOImpl(DAO_BIBLIO_Context dao_BIBLIO_Context) {
		// TODO Auto-generated constructor stub
		this.dao_BIBLIO_Context = dao_BIBLIO_Context;
	}
	
	

	/*public DAO_BIBLIO_Context getDao_BIBLIO_Context() {
		return dao_BIBLIO_Context;
	}



	public void setDao_BIBLIO_Context(DAO_BIBLIO_Context dao_BIBLIO_Context) {
		this.dao_BIBLIO_Context = dao_BIBLIO_Context;
	}*/



	@Override
	public void ajouter(LIVRE Livre) {
		// TODO Auto-generated method stub
		Connection connexion = null;
		PreparedStatement preparedStatement = null;
		try {
			connexion = DAO_BIBLIO_Context.getConnection();
			preparedStatement = connexion.prepareStatement("INSERT INTO Livre(titre_Livre) values(?)");
			preparedStatement.setString(1,Livre.getTitre_Livre());
			System.out.println(Livre.getTitre_Livre());
			System.out.println("Succes(ajouter)");
			preparedStatement.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void ajouter(ABONNE Abonne) {
		// TODO Auto-generated method stub
		Connection connexion = null;
		PreparedStatement preparedStatement = null;
		/*DAO_BIBLIO_Context obj_Dao_BiblioContext = new DAO_BIBLIO_Context();*/
	 String insertBiblio = "INSERT INTO Abonne(nom,prenom) VALUES (?,?);";
	 System.out.println(Abonne.getNom());
		try {
			connexion = DAO_BIBLIO_Context.getConnection();
			preparedStatement = connexion.prepareStatement(insertBiblio);
			preparedStatement.setString(1,Abonne.getNom());
			preparedStatement.setString(2,Abonne.getPrenom());
			System.out.println(Abonne.getNom());
			System.out.println("Succes(ajouter)");
			preparedStatement.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<LIVRE> lister() {
		// TODO Auto-generated method stub
		List<LIVRE>lLivre = new ArrayList <LIVRE>();
		Connection connexion = null;
		PreparedStatement preparedStatement = null;
		try {
			connexion =DAO_BIBLIO_Context.getConnection();
		}catch(SQLException e1) {
			System.out.println("Erreur dans getconnection");
			e1.printStackTrace();	
		}String query = "SELECT * FROM LIVRE";
		Statement state = null;
		try {
			state = connexion.createStatement();
		}catch(SQLException e) {
			System.out.println("erreur creatStatement");
			e.printStackTrace();
		}
		ResultSet Resultat = null;
		try {
			Resultat =state.executeQuery(query);
		}catch(SQLException e) {
			System.out.println("Erreur dans excuteQuery"); 
			e.printStackTrace();
					}
		try {
			while(Resultat.next()) {
				LIVRE nLivre = new LIVRE();
				String titre_Livre = Resultat.getString("titre_Livre");
				int numLivre = Resultat.getInt("num_Livre");
				String dispo_emprunt = Resultat.getString("dispo_emprunt");
				String langue_Livre = Resultat.getString("langue_Livre");
				/*String état_Usure = Resultat.getString("état_Usure");*/
				nLivre.setTitre_Livre(titre_Livre);
				nLivre.setNum_Livre(numLivre);
				nLivre.setLangue_Livre(langue_Livre);
				nLivre.setDispo_emprunt(dispo_emprunt);
				/*nLivre.setÉtat_Usure(état_Usure);*/
				lLivre.add(nLivre);
			}
		}catch(SQLException e) {
			System.out.println("Erreur dans le résultat");
			e.printStackTrace();
		}
		return lLivre;
	}

	@Override
	public List<ABONNE> lister1() {
		// TODO Auto-generated method stub
		List<ABONNE>nAbonne = new ArrayList<ABONNE>();
		Connection connexion = null;
		PreparedStatement preparedStatement = null;
		/*DAO_BIBLIO_Context obj_Dao_BiblioContext = new DAO_BIBLIO_Context();*/
		try {
			connexion =DAO_BIBLIO_Context.getConnection();
		}catch (SQLException e1) {
			System.out.println("Erreur dans getconnection");
			e1.printStackTrace();		
		}
		String query = "SELECT * FROM ABONNE";
		Statement state = null;
		try {
			state = connexion.createStatement();
		}catch (SQLException e) {
			System.out.println("Erreur dans createStatement");
			e.printStackTrace();
		}
		ResultSet Resultat = null;
		try {
			Resultat = state.executeQuery(query);
		}catch(SQLException e) {
			System.out.println("Erreur dans executeQuery"); 
			e.printStackTrace();
		}
		try {
			while(Resultat.next()){
			ABONNE aAbonne = new ABONNE()	;
			String nom = Resultat.getString("Nom");
			String prenom = Resultat.getString("Prenom");
			int num_Matricule = Resultat.getInt("num_matricule");
			String pays = Resultat.getString("Pays");
			int téléphone = Resultat.getInt("Téléphone");
		    String livreRecherché = Resultat.getString("livre_recherché");
		    String livreEmprunté=Resultat.getString("livre_emprunté");
		    String catpro=Resultat.getString("catégorie_pro");
			aAbonne.setNom(nom);
			aAbonne.setPrenom(prenom);
			aAbonne.setNum_matricule(num_Matricule);
			aAbonne.setPays(pays);
			aAbonne.setTéléphone(téléphone);
            aAbonne.setLivre_Recherché(livreRecherché);
            aAbonne.setLivre_Emprunté(livreEmprunté);
            aAbonne.setCatégorie_pro(catpro);
			nAbonne.add(aAbonne);
			}
		}catch (SQLException e) {
			System.out.println("Erreur dans le resultat");
			e.printStackTrace();
		}
		return  nAbonne;
	}



	@Override
	public void modifier(LIVRE Livre) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void modifier(ABONNE Abonne) {
		// TODO Auto-generated method stub
		Connection connexion = null;
		PreparedStatement preparedStatement = null;
		try {
			connexion = DAO_BIBLIO_Context.getConnection();
			preparedStatement = connexion.prepareStatement("UPDATE Abonne SET nom=?,prenom=? where num_matricule = ?");/**/
			preparedStatement.setString(1,Abonne.getNom());
			preparedStatement.setString(2,Abonne.getPrenom());
			/*preparedStatement.setString(3,Abonne.getPays());*/
			preparedStatement.setInt(3,Abonne.getNum_matricule());
			preparedStatement.executeUpdate();
			System.out.println("Succes");
		}catch(SQLException e) {
			System.out.println("Erreur dans le modification");
			e.printStackTrace();
		}
		
	}



	@Override
	public void supprimer(LIVRE Livre) {
		// TODO Auto-generated method stub
		Connection connexion = null;
		PreparedStatement preparedStatement = null;
		try {
			connexion = DAO_BIBLIO_Context.getConnection();
			preparedStatement = connexion.prepareStatement("DELETE From Abonne WHERE num_Livre = ?; ");
			preparedStatement.setInt(1,Livre.getNum_Livre());
			preparedStatement.executeUpdate();
			System.out.println("Succes");
		
	}catch(SQLException e) {
		System.out.println("Erreur dans la suppression");
		e.printStackTrace();
	}
		
	}



	@Override
	public void supprimer(ABONNE Abonne) {
		// TODO Auto-generated method stub
		Connection connexion = null;
		PreparedStatement preparedStatement = null;
		try {
			connexion = DAO_BIBLIO_Context.getConnection();
			preparedStatement = connexion.prepareStatement("DELETE From Abonne WHERE num_matricule = ?; ");
			preparedStatement.setInt(1,Abonne.getNum_matricule());
			preparedStatement.executeUpdate();
			System.out.println("Succes(supprimer)");
		
	}catch(SQLException e) {
		System.out.println("Erreur dans la suppression");
		e.printStackTrace();
	}
		
	}



	

}
