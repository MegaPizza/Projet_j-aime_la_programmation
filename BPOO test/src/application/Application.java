package application;
import carte.Capacit�;
import carte.Carte;
import carte.Charge;
import carte.ICarte;
import carte.Serviteur;
import carte.Sort;
import carte.ICapacit�;

public class Application {
	public static void main(String[]arg){
		
		Charge c = new Charge();
		Serviteur premier = new Serviteur("Chasse-mar�e	murloc", 2, c.getNomCapacit�(), c.getDescription(), 2, 1);
		System.out.println(premier);
		/*
		Sort deuxieme = new Sort("Charge", 2, 2, 1);
		System.out.println(deuxieme);
		
		if(premier.equals(premier)) {
			System.out.println("Les deux cartes sont �gales !");
		}
		else {
			System.out.println("Non non pas �gales");
		}
		*/
	}
}
