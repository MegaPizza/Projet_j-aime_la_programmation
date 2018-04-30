package carte;
import carte.ICapacite;
import joueur.Heros;

public class Capacite implements ICapacite{

	private String nomCapacité;
	private String description;
	
	public Capacite(String nom, String description) {
		this.nomCapacité = nom;
		this.description = description;
	}
	
	public String toString() {
		return "Capacité[ nom = " + this.nomCapacité + "; description = " + this.description + "]";
	}
	
	@Override
	public void executerAction(Object cible) {
		// TODO Auto-generated method stub
		
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
		return this.description;
	}

	@Override
	public String getNomCapacité() {
		return this.nomCapacité;
	}
	
	public void setDescription(String d) {
		this.description = d;
	}
	
	public void setNomCapacité(String n) {
		this.nomCapacité = n;
	}
	
}
