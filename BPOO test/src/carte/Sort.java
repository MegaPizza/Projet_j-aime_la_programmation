package carte;
import carte.Carte;

public class Sort extends Carte implements ICapacité{

	public Sort(String n, int c, Capacité capacité, int a, int nb){
		super(n,c, capacité);
		//setter plutot
		this.getAttaque() = a;
		this.getNombrePointsDeVie() = nb;
		this.getCapacité() = capacité;
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
		return "Sort[" + this.getNom() + "; cout = " + this.getCout() + "; mana =" + this.attaque + "; nombre de points de vie =" + this.nombrePointsDeVie + "]";
	}

	@Override
	public void executerEffetDebutTour() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executerEffetDisparition(Object cible) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executerEffetFinTour() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executerEffetMiseEnJeu(Object cible) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
