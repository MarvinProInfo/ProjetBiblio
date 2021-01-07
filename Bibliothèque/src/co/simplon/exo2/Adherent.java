package co.simplon.exo2;

import java.time.LocalDate;
import java.util.ArrayList;

import co.simplon.aller.plus.loin.Exemplaire;


public class Adherent {
	
	private String nom;
	private String prenom;
	private LocalDate date_de_naissance;
	private String adresse_mail;
	private String adresse_postal;
	private ArrayList <Exemplaire> emprunt=new ArrayList<Exemplaire>() ;
	private ArrayList <LocalDate> dateEmprunt = new ArrayList<LocalDate>();
 
	
	
	public Adherent() {

	}

	public Adherent(String nom, String prenom, LocalDate date_de_naissance, String adresse_mail, String adresse_postal) {
		this.nom = nom;
		this.prenom = prenom;
		this.date_de_naissance = date_de_naissance;
		this.adresse_mail = adresse_mail;
		this.adresse_postal = adresse_postal;
	}

	@Override
	public String toString() {
		return "Adherent [nom=" + nom + ", prenom=" + prenom + ", date_de_naissance=" + date_de_naissance
				+ ", adresse_mail=" + adresse_mail + ", adresse_postal=" + adresse_postal + "]";
	}
	
	
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}
	
	
	public void setAdresse_postal(String adresse_postal) {
		this.adresse_postal = adresse_postal;
	}

	public String getAdresse_postal() {
		return adresse_postal;
	}

	

	public ArrayList<Exemplaire> getEmprunt() {
		return emprunt;
	}

	public void setEmprunt(ArrayList<Exemplaire> emprunt) {
		this.emprunt = emprunt;
	}
	

	public ArrayList<LocalDate> getDateEmprunt() {
		return dateEmprunt;
	}

	public void setDateEmprunt(ArrayList<LocalDate> dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}

	public void emprunter(Exemplaire exemplaire, LocalDate Date_de_prêt ) {
		this.emprunt.add(exemplaire);
		this.dateEmprunt.add(Date_de_prêt);;
		
	
		
	}
	
	
	

}
