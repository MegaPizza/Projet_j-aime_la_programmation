package carte;
import carte.ICapacite;
import joueur.Heros;

public class Capacite implements ICapacite{

	private String nomCapacit�;
	private String description;
	
	public Capacite(String nom, String description) {
		this.nomCapacit� = nom;
		this.description = description;
	}
	
	public String toString() {
		return "Capacit�[ nom = " + this.nomCapacit� + "; description = " + this.description + "]";
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
	public String getNomCapacit�() {
		return this.nomCapacit�;
	}
	
	public void setDescription(String d) {
		this.description = d;
	}
	
	public void setNomCapacit�(String n) {
		this.nomCapacit� = n;
	}
	
}
