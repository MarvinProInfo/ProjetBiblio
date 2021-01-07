package co.simplon.aller.plus.loin;

public class Exemplaire {
	
	


	private String Editeur;
	private int anEdition;
	
	
	public Exemplaire(String editeur, int anEdition) {
		super();
		this.Editeur = editeur;
		this.anEdition = anEdition;
	}


	public String getEditeur() {
		return Editeur;
	}


	public void setEditeur(String editeur) {
		this.Editeur = editeur;
	}


	public int getAnEdition() {
		return anEdition;
	}


	public void setAnEdition(int anEdition) {
		this.anEdition = anEdition;
	}
	
	
	@Override
	public String toString() {
		return "Exemplaire [Editeur=" + Editeur + ", anEdition=" + anEdition + "]";
	}
	

}
