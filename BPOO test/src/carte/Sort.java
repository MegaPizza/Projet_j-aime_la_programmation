package carte;
import carte.Carte;
import joueur.Heros;

public class Sort extends Carte{

	public Sort(String n, int c, Capacite capacite){
			super(n,c, capacite);
	}
	
	@Override
	public boolean disparait() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void executerAction(Object cible) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executerEffetDebutMiseEnJeu(Object cible) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executerDebutTour() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executerEffetDisparition() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executerFinTour() {
		// TODO Auto-generated method stub
		
	}
	
	public boolean equals(Object obj) {
		if(obj == this) return true;
		if(obj == null) return false;
		if(!(obj instanceof Sort)) return false;
		Sort s = (Sort) obj; 
		return this.getNom().equals(s.getNom());
	}
	
	public String toString() {
		return "\nSort[" + super.toString() + "]";
	}

	public String getDescription() {
		return this.getDescription();
	}
	public String getNomCapacité() {
		return this.getNomCapacité();
	}
	

}
