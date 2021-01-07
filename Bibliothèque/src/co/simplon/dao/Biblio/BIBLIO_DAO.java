package co.simplon.dao.Biblio;

import co.simplon.model.Biblio.
*;

import java.util.ArrayList;
import java.util.List;

public interface BIBLIO_DAO {
	
	void ajouter (LIVRE Livre);
	void ajouter (ABONNE Abonne);
	void modifier (LIVRE Livre);
	void modifier (ABONNE abonne);
	void supprimer (LIVRE Livre);
	void supprimer (ABONNE Abonne);
	 List<LIVRE> lister() ;
	 List<ABONNE> lister1();

}
