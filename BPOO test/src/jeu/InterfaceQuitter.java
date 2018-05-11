public class InterfaceQuitter extends Interface {
	public InterfaceQuitter (Interface suivant){
		super(suivant);
	}

	public String getDescription(){
		return "Quitter";
	}

	public bool saitInteragir(String choix){
		return getDescription().equals(choix);
	}

	public void executerInteraction(Dessin d){
		es.println("Au revoir");
		system.exit(0);
	}