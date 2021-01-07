package co.simplon.exo2;

public class Auteur {
	
	private String id_Auteur;
	private String nom;
	private String prenom;
	
	
	public Auteur(String id_Auteur, String nom, String prenom) {
		this.id_Auteur = id_Auteur;
		this.nom = nom;
		this.prenom = prenom;
	}


	public String getId_Auteur() {
		return id_Auteur;
	}


	public void setId_Auteur(String id_Auteur) {
		this.id_Auteur = id_Auteur;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	
	
	

}
