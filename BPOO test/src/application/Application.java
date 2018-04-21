package application;
import carte.Capacité;
import carte.Carte;
import carte.Charge;
import carte.ICarte;
import carte.Serviteur;
import carte.Sort;
import carte.ICapacité;

public class Application {
	public static void main(String[]arg){
		
		Charge c = new Charge();
		Serviteur premier = new Serviteur("Chasse-marée	murloc", 2, c.getNomCapacité(), c.getDescription(), 2, 1);
		System.out.println(premier);
		/*
		Sort deuxieme = new Sort("Charge", 2, 2, 1);
		System.out.println(deuxieme);
		
		if(premier.equals(premier)) {
			System.out.println("Les deux cartes sont égales !");
		}
		else {
			System.out.println("Non non pas égales");
		}
		*/
	}
}
