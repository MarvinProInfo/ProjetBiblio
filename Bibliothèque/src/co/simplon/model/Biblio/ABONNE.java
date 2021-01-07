package co.simplon.model.Biblio;

import java.time.LocalDate;

public class ABONNE {
	
	private int num_matricule;
	private String nom;
	private String prenom;
	private String Pays;
	private LocalDate date_de_naissance;
	private int Téléphone;
	private String Livre_Recherché;
	private String Catégorie_pro;
	private String Livre_Emprunté;
	
	public ABONNE() {
	}


	
	
	public ABONNE(int num_matricule, String nom, String prenom, String pays, LocalDate date_de_naissance, int téléphone,
			String livre_Recherché, String catégorie_pro, String livre_Emprunté) {
		super();
		this.num_matricule = num_matricule;
		this.nom = nom;
		this.prenom = prenom;
		Pays = pays;
		this.date_de_naissance = date_de_naissance;
		Téléphone = téléphone;
		Livre_Recherché = livre_Recherché;
		Catégorie_pro = catégorie_pro;
		Livre_Emprunté = livre_Emprunté;
	}




	public int getNum_matricule() {
		return num_matricule;
	}

	public void setNum_matricule(int num_matricule) {
		this.num_matricule = num_matricule;
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
	
	
	public String getPays() {
		return Pays;
	}


	public void setPays(String pays) {
		Pays = pays;
	}




	public LocalDate getDate_de_naissance() {
		return date_de_naissance;
	}

	public void setDate_de_naissance(LocalDate date_de_naissance) {
		this.date_de_naissance = date_de_naissance;
	}

	public int getTéléphone() {
		return Téléphone;
	}

	public void setTéléphone(int téléphone) {
		Téléphone = téléphone;
	}

	public String getLivre_Recherché() {
		return Livre_Recherché;
	}

	public void setLivre_Recherché(String livre_Recherché) {
		Livre_Recherché = livre_Recherché;
	}

	public String getCatégorie_pro() {
		return Catégorie_pro;
	}

	public void setCatégorie_pro(String catégorie_pro) {
		Catégorie_pro = catégorie_pro;
	}

	public String getLivre_Emprunté() {
		return Livre_Emprunté;
	}

	public void setLivre_Emprunté(String livre_Emprunté) {
		Livre_Emprunté = livre_Emprunté;
	}

	@Override
	public String toString() {
		return "ABONNE [num_matricule=" + num_matricule + ", nom=" + nom + ", prenom=" + prenom + ", date_de_naissance="
				+ date_de_naissance + ", Téléphone=" + Téléphone + ", Livre_Recherché=" + Livre_Recherché
				+ ", Catégorie_pro=" + Catégorie_pro + ", Livre_Emprunté=" + Livre_Emprunté + "]";
	}
	
	
	
	

}
