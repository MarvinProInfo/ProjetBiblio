package co.simplon.model.Biblio;

import java.time.LocalDate;

public class ABONNE {
	
	private int num_matricule;
	private String nom;
	private String prenom;
	private String Pays;
	private LocalDate date_de_naissance;
	private int T�l�phone;
	private String Livre_Recherch�;
	private String Cat�gorie_pro;
	private String Livre_Emprunt�;
	
	public ABONNE() {
	}


	
	
	public ABONNE(int num_matricule, String nom, String prenom, String pays, LocalDate date_de_naissance, int t�l�phone,
			String livre_Recherch�, String cat�gorie_pro, String livre_Emprunt�) {
		super();
		this.num_matricule = num_matricule;
		this.nom = nom;
		this.prenom = prenom;
		Pays = pays;
		this.date_de_naissance = date_de_naissance;
		T�l�phone = t�l�phone;
		Livre_Recherch� = livre_Recherch�;
		Cat�gorie_pro = cat�gorie_pro;
		Livre_Emprunt� = livre_Emprunt�;
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

	public int getT�l�phone() {
		return T�l�phone;
	}

	public void setT�l�phone(int t�l�phone) {
		T�l�phone = t�l�phone;
	}

	public String getLivre_Recherch�() {
		return Livre_Recherch�;
	}

	public void setLivre_Recherch�(String livre_Recherch�) {
		Livre_Recherch� = livre_Recherch�;
	}

	public String getCat�gorie_pro() {
		return Cat�gorie_pro;
	}

	public void setCat�gorie_pro(String cat�gorie_pro) {
		Cat�gorie_pro = cat�gorie_pro;
	}

	public String getLivre_Emprunt�() {
		return Livre_Emprunt�;
	}

	public void setLivre_Emprunt�(String livre_Emprunt�) {
		Livre_Emprunt� = livre_Emprunt�;
	}

	@Override
	public String toString() {
		return "ABONNE [num_matricule=" + num_matricule + ", nom=" + nom + ", prenom=" + prenom + ", date_de_naissance="
				+ date_de_naissance + ", T�l�phone=" + T�l�phone + ", Livre_Recherch�=" + Livre_Recherch�
				+ ", Cat�gorie_pro=" + Cat�gorie_pro + ", Livre_Emprunt�=" + Livre_Emprunt� + "]";
	}
	
	
	
	

}
