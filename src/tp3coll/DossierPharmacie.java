package tp3coll;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class DossierPharmacie {
	private String nom;
	private HashMap <String, Patient> patients;
	public DossierPharmacie( String nom){
		this.nom=nom;
		patients = new HashMap <String , Patient>();

		}
	
	public void nouveauPatient (String nom, String[] ord) {
		String nomMin = nom.toLowerCase();
		
		if(!patients.containsKey(nomMin)) {
			
			Patient p = new Patient(nomMin);
			for ( String m : ord) {
				p.ajoutMedicament(m);
			}
			patients.put(nomMin, p);
		}
	}
	
	public boolean AjoutMedicament(String nom , String m) {
		
		String nomMin = nom.toLowerCase();
		if(patients.containsKey(nomMin)) {
			patients.get(nomMin).ajoutMedicament(m);
			return true;
		}
		else {
			return false;
		}
		
		
	}
	
	public void affichePatient(String nom) {
		String nomMin = nom.toLowerCase();
		if(patients.containsKey(nomMin)) {
			patients.get(nomMin).affiche();
		}
	    else {

        System.out.println("Patient introuvable");
        }
	}
	
	public void affiche() {
		System.out.println("Pharmacie : "+ nom);
		for(Patient p : patients.values()) {
			p.affiche();
		}
	}
	
	public Collection<String> PatientAvecMedicament(String m){
		Collection <String> resultat = new ArrayList<>();
		
		for (Patient p : patients.values()) {
			if(p.contientMedicament(m)) {
				resultat.add(p.getNom());
			}
			
			
		}
		return resultat;
	}
	
	public void enleverPatientOrdonnanceVide() {
		for (Patient p : patients.values()) {
			if(p.ordonnaceVide()) {
				patients.remove(p);
			}
		}
	}

}
