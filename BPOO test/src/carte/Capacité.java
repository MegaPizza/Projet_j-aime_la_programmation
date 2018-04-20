package carte;

public class Capacité implements ICapacité{

	private String nom;
	private String description;
	
	public Capacité(String nom, String description) {
		this.nom = nom;
		this.description = description;
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
	public String getNom() {
		return this.nom;
	}
	
}
