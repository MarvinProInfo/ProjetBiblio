package co.simplon.aller.plus.loin;

import java.time.LocalDate;
import java.util.ArrayList;

public class AdherentBuilder {
	
	private String nom;
	private String prenom;
	private LocalDate date_de_naissance;
	private String adresse_mail;
	private String adresse_postal;
	private ArrayList <Exemplaire> emprunt=new ArrayList<Exemplaire>() ;
	private ArrayList <LocalDate> dateEmprunt = new ArrayList<LocalDate>();
	
	
	public static class Builder {
		
		private String nom;
		private String prenom;
		private LocalDate date_de_naissance;
		private String adresse_mail;
		private String adresse_postal;
		private ArrayList <Exemplaire> emprunt=new ArrayList<Exemplaire>() ;
		private ArrayList <LocalDate> dateEmprunt = new ArrayList<LocalDate>();
		
		public Builder nom(String nom) {
			this.nom = nom;
			return this;
		}
		
		public Builder prenom(String prenom) {
			this.prenom = prenom;
			return this;
		}
		
		public Builder date_de_naissance(LocalDate date_de_naissance) {
			this.date_de_naissance = date_de_naissance;
			return this;
		}
		
		public Builder adresse_mail(String adresse_mail) {
			this.adresse_mail = adresse_mail;
			return this;
		}
		
		public Builder adresse_postal(String adresse_postal) {
			this.adresse_postal = adresse_postal;
			return this;
		}
		
		/*public Builder emprunt(ArrayList<Exemplaire> emprunt) {
			this.emprunt = emprunt;
			return this;
		}
		
		public Builder dateEmprunt(ArrayList<LocalDate>dateEmprunt) {
			this.dateEmprunt = dateEmprunt;
			return this;
		
		}*/
		
		public AdherentBuilder build() {
			return new AdherentBuilder(this);
			
		}
		
		
	}


private  AdherentBuilder(Builder builder) {
			nom=builder.nom;
			prenom = builder.prenom;
			date_de_naissance=builder.date_de_naissance;
			adresse_mail=builder.adresse_mail;
			adresse_postal=builder.adresse_postal;
			emprunt=builder.emprunt;
			dateEmprunt=builder.dateEmprunt;
		}

		@Override
		public String toString() {
			return "Builder [nom=" + nom + ", prenom=" + prenom + ", date_de_naissance=" + date_de_naissance
					+ ", adresse_mail=" + adresse_mail + ", adresse_postal=" + adresse_postal + ", emprunt=" + emprunt
					+ ", dateEmprunt=" + dateEmprunt + "]";
		}
		
		
}
