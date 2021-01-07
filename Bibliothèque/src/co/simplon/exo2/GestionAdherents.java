package co.simplon.exo2;


import java.time.*;

import co.simplon.aller.plus.loin.Exemplaire;
public class GestionAdherents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Adherent lolo = new Adherent ("Patrick", "Lolo", null, null, null);
		System.out.println(lolo.toString()); 
		/*Adherent toto = new Adherent ("Patrick", "Lolo", null, null, null);*/
		Adherent toto = lolo;
		Adherent popo = new Adherent ("Patrick", "Lolo", null, null, null);
		Adherent roro = new Adherent ("Patrick", "Lolo", null, null, null);
		System.out.println(toto==lolo);//*== juge la référence, pas la valeur

		
		/*lolo.emprunter(Livre, 28/03/2020);*/
		
		Bibliothèque Bibliokids = new Bibliothèque(null, null);
		Bibliokids.inscrire(toto);
		Bibliokids.inscrire(popo);
		Bibliokids.inscrire(lolo);
		Bibliokids.inscrire(roro);
		
		System.out.println(Bibliokids.getList());
		
		Bibliokids.desinscrire(roro);
		
		System.out.println(Bibliokids.getList());
		
		Exemplaire L1 = new Exemplaire ("Glénat", 2020);
		toto.emprunter(L1, LocalDate.of(2020,8,12));
		System.out.println(toto.getNom()+""+"Liste des livre emprunté:"+toto.getEmprunt()+""+ toto.getDateEmprunt());
		
     
		

		
		

	}

}
