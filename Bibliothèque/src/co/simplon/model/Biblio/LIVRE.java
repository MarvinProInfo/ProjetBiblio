package co.simplon.model.Biblio;

public class LIVRE {
	
	private int num_Livre;
	private String titre_Livre;
	private String dispo_emprunt;
	private String langue_Livre;
	private String Ètat_Usure;
	
	
	public LIVRE() {
	}

	

	public LIVRE(int num_Livre, String titre_Livre, String dispo_emprunt, String langue_Livre, String Ètat_Usure) {
		this.num_Livre = num_Livre;
		this.titre_Livre = titre_Livre;
		this.dispo_emprunt = dispo_emprunt;
		this.langue_Livre = langue_Livre;
		this.Ètat_Usure = Ètat_Usure;
	}


	public int getNum_Livre() {
		return num_Livre;
	}


	public void setNum_Livre(int num_Livre) {
		this.num_Livre = num_Livre;
	}


	public String getTitre_Livre() {
		return titre_Livre;
	}


	public void setTitre_Livre(String titre_Livre) {
		this.titre_Livre = titre_Livre;
	}


	public String getDispo_emprunt() {
		return dispo_emprunt;
	}


	public void setDispo_emprunt(String dispo_emprunt) {
		this.dispo_emprunt = dispo_emprunt;
	}


	public String getLangue_Livre() {
		return langue_Livre;
	}


	public void setLangue_Livre(String langue_Livre) {
		this.langue_Livre = langue_Livre;
	}


	public String get…tat_Usure() {
		return Ètat_Usure;
	}


	public void set…tat_Usure(String Ètat_Usure) {
		this.Ètat_Usure = Ètat_Usure;
	}
	
	
	
	

}
