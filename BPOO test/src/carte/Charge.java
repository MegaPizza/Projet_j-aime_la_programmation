package carte;

public class Charge extends Capacite{
	
	public Charge() {
		super("Charge", "Cette capacit� permet de ne pas attendre avant d'attaquer \n");
	}
	@Override
	public void executerEffetDebutTour() {
		System.out.println("peut attaquer right now");
	}

}
