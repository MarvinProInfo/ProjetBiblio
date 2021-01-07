package co.simplon.aller.plus.loin;

import java.time.LocalDate;

public class GestionAdherents {
	
public static void main(String[] args) {
	
	AdherentBuilder n = new AdherentBuilder.Builder()
			.nom("SAINTE-ROSE")
			.prenom("Marvin")
			.date_de_naissance(LocalDate.of(1993, 03, 28))
			.adresse_mail("sainterosemarvin@gmail.com")
			.adresse_postal("37, avenue Lénine, 93230 Romainville")
			.build();
	
	System.out.println(n);
	
}
}
