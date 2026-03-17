package tp3coll;

public class TestPharmacie {
	public static void main(String[] args) {
		DossierPharmacie pharmacie = new DossierPharmacie("PharmaSfax");
		
		
		String[] ord1 = {"Doliprane", "VitamineE"};
        String[] ord2 = {"Aspirine", "VitamineE"};
        String[] ord3 = {"Ventoline"};
        
		pharmacie.nouveauPatient("mariem",ord1);
		pharmacie.nouveauPatient("tatana3ima", ord3);
		pharmacie.nouveauPatient("el7ajali", ord2);
		
		pharmacie.affiche();
		
		pharmacie.AjoutMedicament("TATANA3IMA", "smecta");
		pharmacie.affichePatient("Mariem");
		
		

	}

}
