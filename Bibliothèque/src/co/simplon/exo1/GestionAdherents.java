package co.simplon.exo1;

import co.simplon.exo2.Adherent;

public class GestionAdherents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Adherent lolo = new Adherent ("Patrick", "Lolo", null, null, null);
		System.out.println(lolo.toString()); 
		Adherent toto = new Adherent ("Patrick", "Lolo", null, null, null);
		System.out.println(toto==lolo);
		

	}

}
