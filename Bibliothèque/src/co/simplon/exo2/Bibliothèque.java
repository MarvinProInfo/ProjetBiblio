package co.simplon.exo2;


import java.util.ArrayList;
import java.util.List;

public class Bibliothèque {
	private String nom;
	private String adresse;
	private List<Adherent> List = new ArrayList<Adherent>();
	
	public Bibliothèque(String nom, String adresse) {
		super();
		this.nom = nom;
		this.adresse = adresse;
	}

	
	@Override
	public String toString() {
		return "Bibliothèque [nom=" + nom + ", adresse=" + adresse + "]";
	}
	
	



	public List<Adherent> getList() {
		return List;
	}


	public void setList(List<Adherent> list) {
		List = list;
	}


	public void inscrire(Adherent adherent) {
		nom=adherent.getNom();
		adresse=adherent.getAdresse_postal();
		List.add(adherent);
	}
	
	public void desinscrire(Adherent adherent) {
		nom=adherent.getNom();
		adresse=adherent.getAdresse_postal();
		List.remove(adherent);
	}


 







}
