package carte;

public class Charge extends Capacit�{
	
	public Charge() {
		super("Charge", "Cette capacit� permet � un serviteur de ne pas attendre avant d'attaquer");
	}
	public String toString() {
		return "[" + this.getNom() + ";" + this.getDescription() + "]";
	}

}
