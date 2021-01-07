package co.simplon.exo2;

public class Livre {

	private String identifiant;
	private String titre;
	private String auteur;
	
	
	public Livre(String identifiant, String titre, String auteur) {
		this.identifiant = identifiant;
		this.titre = titre;
		this.auteur = auteur;
	}


	public String getIdentifiant() {
		return identifiant;
	}


	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public String getAuteur() {
		return auteur;
	}


	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
	
	
	
	
	
	
	
}
