package carte;

public class Charge extends Capacite{
	
	public Charge() {
		super("Charge", "Cette capacité permet de ne pas attendre avant d'attaquer \n");
	}
	@Override
	public void executerEffetDebutTour() {
		System.out.println("peut attaquer right now");
	}

}
