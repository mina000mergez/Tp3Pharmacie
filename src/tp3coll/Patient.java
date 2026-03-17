package tp3coll;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;

public class Patient {

	private  String nom;
	private Set <String> ordonnance;
	
	public Patient(String nom) {
		this.nom=nom;
		ordonnance = new HashSet <>();
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom=nom;
	}
	
	public Set<String> getOrd(){
		return ordonnance;
	}
	
	public void setOrd(Set<String> ordonnance) {
		this.ordonnance=ordonnance;
	}
	
	public boolean ordonnaceVide() {
		return ordonnance.isEmpty();
	}
	
	public void ajoutMedicament (String m) {
		ordonnance.add(m);
	}
	
	public void affiche() {
		System.out.println("patient "+ nom);
		
		Iterator <String> iterator = ordonnance.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(""+ iterator.next());
		}
	}
	
	public boolean contientMedicament(String m) {
		return ordonnance.contains(m);
	}
	
	public void trieOrdonnance() {
		
		Set <String> ordonnanceTrie = new TreeSet <>(ordonnance);
		ordonnance=ordonnanceTrie;
	}
	

}
